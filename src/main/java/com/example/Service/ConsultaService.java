package com.example.Service;

import java.util.List;

import com.example.entity.Consulta;
import com.example.entity.Medico;
import com.example.entity.Paciente;
import com.example.entity.Prontuario;
import com.example.enums.StatusDeConsulta;
import java.util.ArrayList;


public class ConsultaService {
    private List<Consulta> consultas = new ArrayList<Consulta>();;
    private List<Prontuario> prontuarios = new ArrayList<Prontuario>();;
    private EmailService emailService = new EmailService();

    public void realizarConsulta(Consulta consulta, Prontuario prontuario) {
        consultas.add(consulta);
        // mudar o status de EM_ANDAMENTO para CONCLUIDA
        consulta.setStatus(StatusDeConsulta.CONCLUIDA);
        System.out.printf("Realizando consulta para o paciente %s com o médico %s%n",
        prontuario.getPaciente().getNomeCompleto(), prontuario.getMedico().getNomeCompleto());
        System.out.printf("Status da consulta: %s%n", consulta.getStatus());
        emailService.enviarEmail(prontuario.getMedico(), prontuario.getPaciente(), "Consulta realizada", "A consulta foi realizada com sucesso");
    }
    
    public boolean marcarConsulta(Paciente paciente, Medico medico, String data, String hora, String observacoes, String diagnostico,
            String tratamento,
            String exame, String medicacao, StatusDeConsulta status) {

        consultas = new ArrayList<Consulta>();

        Prontuario prontuario = new Prontuario(null, paciente, medico, data, hora, observacoes, diagnostico, tratamento, exame, medicacao);
        Consulta consulta = new Consulta(prontuario, status);
        consultas.add(consulta);
        if (consultas.size() == 0) {
            System.out.println("Marcando consulta para o paciente " + paciente.getNomeCompleto());
            return true;
        }
        System.out.println("Consulta já marcada para o paciente " + paciente.getNomeCompleto());
        return false;
    }

    public boolean cancelarConsulta(Paciente paciente, Medico medico, String data, String hora) {
        for(Prontuario prontuario : prontuarios) {
            if (prontuario.getPaciente().getNomeCompleto().equals(paciente.getNomeCompleto())
                    && prontuario.getData().equals(data) && prontuario.getHora().equals(hora)) {
                consultas.remove(prontuario);
                return true;
            }
        }
        return false;
    }
}
