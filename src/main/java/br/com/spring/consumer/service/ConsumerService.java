package br.com.spring.consumer.service;

import br.com.spring.consumer.dto.MessageQueue;

public interface ConsumerService {
    void action(MessageQueue message) throws Exception;
}