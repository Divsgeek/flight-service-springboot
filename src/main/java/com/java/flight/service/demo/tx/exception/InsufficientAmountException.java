package com.java.flight.service.demo.tx.exception;

public class InsufficientAmountException extends RuntimeException{
    public InsufficientAmountException(String message){
        super(message);
    }
}
