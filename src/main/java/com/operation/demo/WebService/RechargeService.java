package com.operation.demo.WebService;


import com.operation.demo.Model.Client;
import com.operation.demo.Model.Operation;
import com.operation.demo.Repository.ClientRepository;
import com.operation.demo.Repository.OperationRepository;

//import com.operation.demo.generated.Recharge;
import com.operation.demo.generated.RechargeRequest;
import com.operation.demo.generated.RechargeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@Service
public class RechargeService {

    @Autowired
    ClientRepository clientRepository;
    @Autowired
    OperationRepository operationRepository;

//    /*@WebMethod*/
    public RechargeResponse rechargeCheck(RechargeRequest recharge){
        RechargeResponse rechargeResponse = new RechargeResponse();
        Client client = clientRepository.getByTelephone(recharge.getNumero());
        if (client != null){
            Operation operation= new Operation();
            operation.setMontant(recharge.getMontant());
            operation.setClient(client);
            operationRepository.save(operation);
             rechargeResponse.setReturn(true);
        }else {
            rechargeResponse.setReturn(false);
        }
            return rechargeResponse;
    }
    /*@WebMethod
    public Boolean Recharge(@WebParam(name="numero") String numero,@WebParam(name="montant") double montant){
        Client client = clientRepository.getByTelephone(numero);
        if (client != null){
            Operation operation= new Operation();
            operation.setMontant(montant);
            operation.setClient(client);
            operationRepository.save(operation);
             return true ;
        }else {
            return false;
        }

    }*/
}
