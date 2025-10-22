package com.example;

import com.example.entity.Consulta;
import com.example.entity.Medico;
import com.example.entity.Paciente;
import com.example.enums.StatusDeConsulta;

public class InicializarAplicacao {
    public static void main(String[] args) {
    
        Paciente paciente = new Paciente("João da Silva", 30, "12345678901", "joao@gmail.com", 
        "12345678901", "Rua das Flores, 123", "São Paulo", "SP", "Brasil", "12345678901", "A+", 
        "Alergias", "Medicamentos", "Histórico Médico", "Histórico Familiar", "Histórico Social", 
        "Histórico Alimentar", "Histórico Psicológico");




        Consulta consulta = new Consulta(paciente, "12.07.2025", "10:00", "Observações", "Diagnóstico", 
        "Tratamento", "Exame", "Medicamento", StatusDeConsulta.AGENDADA);
        Medico medico = new Medico("Dr. João da Silva", 30, "12345678901", "joao@gmail.com", 
        "12345678901", "Rua das Flores, 123", "São Paulo", "SP", "Brasil", "12345678901", "12345678901", "Cardiologista");
        
       
        medico.marcarConsulta(paciente, "12.07.2025", "10:00", "Observações", "Diagnóstico", 
            "Tratamento", "Exame", "Medicamento", StatusDeConsulta.AGENDADA);
        medico.realizarConsulta(consulta);
    
    }
}