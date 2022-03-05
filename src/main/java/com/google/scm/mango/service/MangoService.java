package com.google.scm.mango.service;

import com.google.scm.mango.chaincode.client.ClientApp;
import com.google.scm.mango.dto.Mango;
import org.springframework.stereotype.Service;

@Service
public class MangoService {

    public Mango viewMango(String productId){
       /* Mango mango = new Mango();
        mango.setProductId("4");
        mango.setProducerName("Jay");
        mango.setProducerAddress("Vasant Kunj");*/

        Mango mango = ClientApp.getMango(productId);


        return mango;
    }

}
