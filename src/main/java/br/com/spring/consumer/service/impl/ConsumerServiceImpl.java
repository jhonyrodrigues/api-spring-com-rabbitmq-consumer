package br.com.spring.consumer.service.impl;

import br.com.spring.consumer.dto.Message;
import br.com.spring.consumer.service.ConsumerService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Override
    public void action(Message message) {
        System.out.println(message.getText());
    }
}