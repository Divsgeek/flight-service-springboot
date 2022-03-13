package com.java.flight.service.demo.tx.utils;

import com.java.flight.service.demo.tx.exception.InsufficientAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {

    private static Map<String,Double> paymentMap = new HashMap<>();

    static {
        paymentMap.put("acc1",12000.009);
        paymentMap.put("acc2",10000.078);
        paymentMap.put("acc3",5000.000);
        paymentMap.put("acc4",8000.000);
    }

    public static boolean validateCreditLimit(String accNo,double paidAmount){

        if(paidAmount > paymentMap.get(accNo)){
            throw new InsufficientAmountException("Insufficient funds in account!");
        }
        else{
            return true;
        }

    }
}
