package com.example.entity;

import java.util.ArrayList;
import java.util.List;

import com.example.enums.StatusDeConsulta;

public class Medico extends PessoaBase {
    private String crm;
    private String especialidade;
    private List<Paciente> pacientes = new ArrayList<Paciente>(); ;
    private List<Consulta> consultas = new ArrayList<Consulta>(); ;
    public Medico(String nomeCompleto, Integer idade, String cpf, String email, String telefone, String endereco, 
    String cidade, String estado, String pais, String cep, String crm, String especialidade) {
        super(nomeCompleto, idade, cpf, email, telefone, endereco, cidade, estado, pais, cep);
        this.crm = crm;
        this.especialidade = especialidade;
    }



    public void realizarConsulta(Consulta consulta) {
        consultas.add(consulta); 
        //mudar o status de EM_ANDAMENTO para CONCLUIDA
        consulta.setStatus(StatusDeConsulta.CONCLUIDA);
        System.out.printf("Realizando consulta para o paciente %s com o médico %s%n", 
        consulta.getPaciente().getNomeCompleto(), this.getNomeCompleto());
    System.out.printf("Status da consulta: %s%n", consulta.getStatus());
    }

    public boolean marcarConsulta(Paciente paciente, String data, String hora, String observacoes, String diagnostico, String tratamento, 
    String exame, String medicacao, StatusDeConsulta status) {

        consultas = new ArrayList<Consulta>();

        Consulta consulta = new Consulta(paciente, data, hora, observacoes, diagnostico, tratamento, exame, medicacao, status);
        consultas.add(consulta);
       if (consultas.size() == 0) {
           System.out.println("Marcando consulta para o paciente " + paciente.getNomeCompleto());
           return true;
        }
        System.out.println("Consulta já marcada para o paciente " + paciente.getNomeCompleto());
        return false;
    }

    public boolean cancelarConsulta(Paciente paciente, String data, String hora) {
        for (Consulta consulta : consultas) {
            if (consulta.getPaciente().getNomeCompleto().equals(paciente.getNomeCompleto()) && consulta.getData().equals(data) && consulta.getHora().equals(hora)) {
                consultas.remove(consulta);
                return true;
            }
        }
        return false;
    }

    

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Medico [crm=" + crm + ", especialidade=" + especialidade + "]";
    }
}
