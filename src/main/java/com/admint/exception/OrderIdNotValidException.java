package com.admint.exception;

public class OrderIdNotValidException  extends RuntimeException {
    public OrderIdNotValidException (String message) {
        super(message);
    }
}
