package com.larrysss.accounting.exception;

import org.springframework.http.HttpStatus;

public class InvalidParameterException extends ServiceException{

    public InvalidParameterException(String message) {
        super(message);
        this.setStatusCode(HttpStatus.BAD_REQUEST.value());
        this.setErrorCode("Invalid_Parameter");
        this.setErrorType(ErrorType.Client);
    }
}
