package com.example;

import com.example.Controller.ConsultaController;
import com.example.Controller.PacienteController;
import com.example.Service.ConsultaService;
import com.example.entity.Consulta;
import com.example.entity.Medico;
import com.example.entity.Paciente;
import com.example.entity.Prontuario;
import com.example.enums.StatusDeConsulta;

public class InicializarAplicacao {
    public static void main(String[] args) {
    
        Paciente paciente = new Paciente("João da Silva", 30, "12345678901", "joao@gmail.com", 
        "12345678901", "Rua das Flores, 123", "São Paulo", "SP", "Brasil", "12345678901", "A+", 
        "Alergias", "Medicamentos", "Histórico Médico", "Histórico Familiar", "Histórico Social", 
        "Histórico Alimentar", "Histórico Psicológico");




        Medico medico = new Medico("Dr. Felipe de amorim", 30, "12345678901", "felipe@gmail.com", 
        "12345678901", "Rua das Flores, 123", "São Paulo", "SP", "Brasil", "12345678901", "12345678901", "Cardiologista");
        Prontuario prontuario = new Prontuario(null, paciente, medico, "12.07.2025", "10:00", "Observações", "Diagnóstico", 
        "Tratamento", "Exame", "Medicamento");
        
        Consulta consulta = new Consulta(prontuario, StatusDeConsulta.AGENDADA);
       
        // ConsultaService consultaService = new ConsultaService();
        // consultaService.marcarConsulta(paciente, medico, "12.07.2025", "10:00", "Observações", "Diagnóstico", 
        // "Tratamento", "Exame", "Medicamento", StatusDeConsulta.AGENDADA);
        // consultaService.realizarConsulta(consulta, prontuario);
        // consultaService.cancelarConsulta(paciente, medico, "12.07.2025", "10:00");

    

        ConsultaController consultaController = new ConsultaController();
        consultaController.listarConsultas(consulta);

        PacienteController pacienteController = new PacienteController();
        pacienteController.cadastrarPaciente(paciente);
        pacienteController.mostrarPacientes();
        
      
    }
}