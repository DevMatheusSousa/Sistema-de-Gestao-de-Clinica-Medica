package com.example.Controller;

import java.util.ArrayList;
import java.util.List;

import com.example.Service.PacienteService;
import com.example.entity.Paciente;

public class PacienteController {
    List<Paciente> pacientes = new ArrayList<Paciente>();

    // public void listarPacientes(Paciente paciente){
    // PacienteService pacienteService = new PacienteService();
    // pacienteService.listarPacientes(paciente);
    // }

    public List<Paciente> listarPacientes(Paciente paciente) {
        PacienteService pacienteService = new PacienteService();
        pacienteService.listarPacientes(paciente);
        return pacientes;
    }
}
