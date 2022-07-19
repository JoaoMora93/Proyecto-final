package com.coderhouse.proyecto_final_2da_entregaH2.Handle;

public class ApiException extends Exception {

    private String message;

    public ApiException(String message) {
        super(message);
    }

}