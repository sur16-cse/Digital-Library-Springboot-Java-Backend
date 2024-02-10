package com.example.digitallibrary.exception;

import com.example.digitallibrary.enumeration.ErrorMessage;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class CustomMessage {
    private Integer statusCode;
    @Enumerated(EnumType.STRING)
    private ErrorMessage message;
    private String customMessage;

    public CustomMessage(){
        this.statusCode= 404;
        this.message=ErrorMessage.NOT_FOUND;

    }

    public CustomMessage CREATED(){
        this.message = ErrorMessage.DATA_CREATED;
        this.statusCode = 201;
        return this;
    }


    public CustomMessage PERMANENT_REDIRECT(){
        this.message = ErrorMessage.PERMANENT_REDIRECT;
        this.statusCode = 301;
        return this;
    }

    public CustomMessage TEMPORARY_REDIRECT(){
        this.message = ErrorMessage.TEMPORARY_REDIRECT;
        this.statusCode = 302;
        return this;
    }

    public CustomMessage NOT_MODIFIED(){
        this.message = ErrorMessage.NOT_MODIFIED;
        this.statusCode = 304;
        return this;
    }

    public CustomMessage BAD_REQUEST(){
        this.message=ErrorMessage.BAD_REQUEST;
        this.statusCode=400;
        return this;
    }

    public CustomMessage UNAUTHORIZED(){
        this.message=ErrorMessage.UNAUTHORIZED;
        this.statusCode=401;
        return this;
    }

    public CustomMessage NOTFOUND(){
        this.message=ErrorMessage.NOT_FOUND;
        this.statusCode=404;
        return this;
    }

    public CustomMessage DUPLICATION(){
        this.message=ErrorMessage.CONFLICT;
        this.statusCode=409;
        return this;
    }

    public CustomMessage NO_CONTENT(){
        this.message = ErrorMessage.NO_CONTENT;
        this.statusCode = 204;
        return this;
    }

    public CustomMessage(String message, Integer statusCode) {
        this.customMessage = message;
        this.statusCode = statusCode;
    }

    public CustomMessage(String message, HttpStatus statusCode) {
        this.customMessage = message;
        this.statusCode = statusCode.value();
    }
}
