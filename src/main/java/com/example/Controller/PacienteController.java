package com.example.Controller;

import com.example.Service.PacienteService;
import com.example.entity.Paciente; 
public class PacienteController {
    PacienteService pacienteService = new PacienteService();

    public void cadastrarPaciente(Paciente paciente) {
        pacienteService.adicionarPaciente(paciente);
        System.out.println("Paciente cadastrado com sucesso " + paciente.getNomeCompleto());
    }

    public void mostrarPacientes() {
        pacienteService.listarPacientes();
    }
}
