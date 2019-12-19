package com.operation.demo.endpoint;

import com.operation.demo.WebService.RechargeService;

//import com.operation.demo.generated.Recharge;
import com.operation.demo.generated.RechargeRequest;
import com.operation.demo.generated.RechargeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class RechargeEndpoint {
    private static final String NAMESPACE = "com/operation/demo/generated";

    @Autowired
    private RechargeService rechargeService;

    @PayloadRoot(namespace = NAMESPACE,localPart = "RechargeRequest")
    @ResponsePayload
    public RechargeResponse getRechargeStatus(@RequestPayload RechargeRequest recharge){

        return rechargeService.rechargeCheck(recharge);

    }
}
