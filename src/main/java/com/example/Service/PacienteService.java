package com.example.Service;

import java.util.ArrayList;
import java.util.List;

import com.example.entity.Consulta;
import com.example.entity.Paciente;

public class PacienteService {
    
    private List<Paciente> pacientes = new ArrayList<Paciente>();
    private List<Consulta> consultas = new ArrayList<Consulta>();

    public void listarPacientes(Paciente pacienteDoHospital) {
        pacientes.add(pacienteDoHospital);
        for (Paciente paciente : pacientes) {
            System.out.println("Lista de Paciente: " + paciente.getNomeCompleto() + "\n");
        }
    }

    public void listarConsultas(Consulta consultaDoHospital) {
        consultas.add(consultaDoHospital);
        for (Consulta consulta : consultas) {
            System.out.println(consulta);
        }
    }
}
