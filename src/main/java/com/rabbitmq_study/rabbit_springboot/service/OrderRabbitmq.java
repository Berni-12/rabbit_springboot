package com.rabbitmq_study.rabbit_springboot.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderRabbitmq {

    @Autowired
    private RabbitTemplate rabbitTemplate;






}
