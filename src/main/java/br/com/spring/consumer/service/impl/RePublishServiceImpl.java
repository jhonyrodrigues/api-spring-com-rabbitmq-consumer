package br.com.spring.consumer.service.impl;

import br.com.spring.consumer.amqp.AmqpRepublish;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RePublishServiceImpl implements RePublish {

    private final AmqpRepublish republish;

    @Override
    public void repost() {
        republish.rePublish();
    }
}
