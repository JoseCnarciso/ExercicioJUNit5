package com.exerciciojunit5.demo.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {

    public ObjectNotFoundException( String message ) {
        super(message);
    }
}
