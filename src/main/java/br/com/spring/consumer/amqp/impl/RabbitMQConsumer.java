package br.com.spring.consumer.amqp.impl;

import br.com.spring.consumer.amqp.AmqpConsumer;
import br.com.spring.consumer.dto.Message;
import br.com.spring.consumer.service.ConsumerService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class RabbitMQConsumer implements AmqpConsumer<Message> {

    private final ConsumerService service;

    @Override
    @RabbitListener(queues = "${spring.rabbitmq.request.routing-key.producer}")
    public void consumer(Message message) {
        try {
            service.action(message);
        } catch (Exception ex) {
            throw new AmqpRejectAndDontRequeueException(ex);
        }
    }
}
