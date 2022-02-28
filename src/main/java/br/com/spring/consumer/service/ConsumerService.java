package br.com.spring.consumer.service;

import br.com.spring.consumer.dto.Message;

public interface ConsumerService {
    void action(Message message) throws Exception;
}