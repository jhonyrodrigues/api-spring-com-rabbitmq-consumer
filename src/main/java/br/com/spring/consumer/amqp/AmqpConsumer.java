package br.com.spring.consumer.amqp;

public interface AmqpConsumer<T> {
    void consumer(T t);
}
