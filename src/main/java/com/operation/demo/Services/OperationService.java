package com.operation.demo.Services;

import com.operation.demo.Repository.OperationRepository;
import com.operation.demo.config.AppConfig;
//import com.operation.demo.messagerie.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class OperationService {
    @Autowired
    OperationRepository operation;


//    public void EnvoyerMessage(String s ){
//        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        MessageSender messageSender = (MessageSender) context.getBean(MessageSender.class);
//        messageSender.sendMessage(s);
//        System.out.println("message send !!!!!");
//        ((AbstractApplicationContext)context).close();
//    }
}
