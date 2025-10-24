package com.example.entity;

import java.util.ArrayList;
import java.util.List;

public class PacienteService {
    
    private List<Paciente> pacientes = new ArrayList<Paciente>();
    private List<Consulta> consultas = new ArrayList<Consulta>();

    public void adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
        System.out.println("Paciente adicionado com sucesso");
    }

    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
        System.out.println("Consulta adicionada com sucesso");
    }

    public void listarPacientes() {
        for (Paciente paciente : pacientes) {
            System.out.println("Paciente: " + paciente.getNomeCompleto() + "\n");
        }
    }

    public void listarConsultas() {
        for (Consulta consulta : consultas) {
            System.out.println(consulta);
        }
    }
}
