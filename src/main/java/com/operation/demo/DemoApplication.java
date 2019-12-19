package com.operation.demo;

import com.operation.demo.WebService.RechargeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import javax.xml.ws.Endpoint;

@SpringBootApplication

public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
      /*  String url ="http://localhost:8585/";
        Endpoint.publish(url,new RechargeService());
        System.out.println("Succès   !!");*/
    }

}
