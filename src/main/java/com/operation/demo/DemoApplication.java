package com.operation.demo;

import com.operation.demo.Services.OperationService;
import com.operation.demo.WebService.RechargeService;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.xml.ws.Endpoint;

@SpringBootApplication

public class DemoApplication implements CommandLineRunner {
    @Autowired
    OperationService operationService;

    public static void main(String[] args) throws JMSException {
        SpringApplication.run(DemoApplication.class, args);

    }
    @Override
    public void run(String... args) throws Exception {

    }

}
