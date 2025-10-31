package com.example.Repository;

import java.util.ArrayList;
import java.util.List;

import com.example.entity.Consulta;
import com.example.entity.Medico;
import com.example.entity.Paciente;

public class MedicoRepository {
    private List<Medico> medicos = new ArrayList<Medico>();
    private List<Consulta> consultas = new ArrayList<Consulta>();
    private List<Paciente> pacientes = new ArrayList<Paciente>();


    public void Salvar(Medico medico) {
        medicos.add(medico);
    }

    public List<Medico> buscarMedicos() {
        return new ArrayList<>(this.medicos);
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
