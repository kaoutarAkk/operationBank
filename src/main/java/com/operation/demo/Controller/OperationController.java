package com.operation.demo.Controller;

import com.operation.demo.Services.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("operation")
public class OperationController {
    @Autowired
    OperationService operationService;
}
