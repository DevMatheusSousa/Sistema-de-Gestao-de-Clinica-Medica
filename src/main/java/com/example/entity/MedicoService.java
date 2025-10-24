package com.example.entity;

import java.util.ArrayList;
import java.util.List;

public class MedicoService {
    private List<Medico> medicos = new ArrayList<Medico>();
    private List<Consulta> consultas = new ArrayList<Consulta>();
    private List<Paciente> pacientes = new ArrayList<Paciente>();

    public void adicionarMedico(Medico medico) {
        medicos.add(medico);
        System.out.println("Médico adicionado com sucesso");
    }

    public void listarMedicos() {
        for (Medico medico : medicos) {
            System.out.println("Médico: " + medico.getNomeCompleto() + "\n");
        }
    }

    public void listarConsultas() {
        for (Consulta consulta : consultas) {
            System.out.println(consulta);
        }
    }

    public void adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
        System.out.println("Paciente adicionado com sucesso");
    }

    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
        System.out.println("Consulta adicionada com sucesso");
    }

}
