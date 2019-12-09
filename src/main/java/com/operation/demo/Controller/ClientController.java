package com.operation.demo.Controller;


import com.operation.demo.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clientsoperation")
public class ClientController {
    @Autowired
    ClientService clientService;
}
