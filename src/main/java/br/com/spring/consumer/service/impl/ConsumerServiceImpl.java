package br.com.spring.consumer.service.impl;

import br.com.spring.consumer.dto.MessageQueue;
import br.com.spring.consumer.service.ConsumerService;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Override
    public void action(MessageQueue message) {
        if ("teste".equalsIgnoreCase(message.getText())){
            throw new AmqpRejectAndDontRequeueException("[CONSUMER_SERVICE] - Erro");
        }
        System.out.println(message.getText());
    }
}