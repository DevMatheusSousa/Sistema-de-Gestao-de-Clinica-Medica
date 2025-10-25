package com.example.entity;

import com.example.enums.StatusDeConsulta;

public class Consulta {
    private Prontuario prontuario;
    private StatusDeConsulta status;
    

    public Consulta(Prontuario prontuario, StatusDeConsulta status) {
        this.prontuario = prontuario;
        this.status = status;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }

    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }

    public StatusDeConsulta getStatus() {
        return status;
    }

    public void setStatus(StatusDeConsulta status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Consulta [prontuario=" + prontuario + ", status=" + status + "]";
    }
}
