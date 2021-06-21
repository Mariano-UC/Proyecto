package com.ucreativa.rutinaGym.entities.ui;

public class ErrorEnEdadException extends Exception {
    public ErrorEnEdadException(String edad){
        super("La edad ingresada no es valida " + edad);
    }
}
