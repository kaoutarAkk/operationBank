package com.operation.demo.Services;

import com.operation.demo.Repository.OperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationService {
    @Autowired
    OperationRepository operation;
}
