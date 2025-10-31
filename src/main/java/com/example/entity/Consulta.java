package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.enums.StatusDeConsulta;

@Entity
@Table(name = "consultas")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Consulta [prontuario=" + prontuario + ", status=" + status + "]";
    }
}
