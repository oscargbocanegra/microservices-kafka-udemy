package com.banking.cqrs.core.exeptions;

public class AggregateNotFoundException extends RuntimeException{
    public AggregateNotFoundException(String message){
        super(message);
    }
}
