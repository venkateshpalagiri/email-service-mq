package com.venkatesh.email_service.consumer;

import com.venkatesh.email_service.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
    Logger LOGGER= LoggerFactory.getLogger(OrderConsumer.class);
    @RabbitListener(queues = "${rabbitmq.queue.email.name}")
    public void consume(OrderEvent orderEvent){
        LOGGER.info(String.format("Order event received form email queue => %s",orderEvent.toString()));

        // email service needs to email customer
    }
}
