package com.zuizui.service.exception;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException() {
        super();
    }

    public InsufficientFundsException(String message) {
        super(message);
    }

}
