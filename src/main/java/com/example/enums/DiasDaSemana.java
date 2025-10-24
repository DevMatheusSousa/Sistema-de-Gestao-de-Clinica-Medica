package com.example.enums;

public enum DiasDaSemana {
    DOMINGO ("Domingo"),
    SEGUNDA ("Segunda"),
    TERÇA ("Terça"),
    QUARTA ("Quarta"),
    QUINTA ("Quinta"),
    SEXTA ("Sexta"),
    SÁBADO ("Sábado");

    private String message;

    DiasDaSemana(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    
    
}
