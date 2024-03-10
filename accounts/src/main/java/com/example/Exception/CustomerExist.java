package com.example.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CustomerExist extends RuntimeException{

    public CustomerExist(String message)
    {
        super(message);
    }

}
