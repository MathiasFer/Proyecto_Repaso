package com.empresa.erp.common.exception;

import org.springframework.expression.AccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice //Intercepta todas las excepciones que ocurren en los controladores REST
public class GlobalExceptionHandler {

    @ExceptionHandler(AccessException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public Map <String, String> handleAccessDenied(){
        return Map.of("error", "Acceso denegado");
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, String> handleGeneral() {
        return Map.of("error", "Error interno");
    }
}
