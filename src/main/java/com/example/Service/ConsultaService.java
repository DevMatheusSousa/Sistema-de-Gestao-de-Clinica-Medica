package com.example.Service;

import java.util.ArrayList;
import java.util.List;

import com.example.Repository.ConsultaRepository;
import com.example.Service.support.EmailService;
import com.example.entity.Consulta;
import com.example.entity.Medico;
import com.example.entity.Paciente;
import com.example.entity.Prontuario;
import com.example.enums.StatusDeConsulta;

public class ConsultaService {
    private ConsultaRepository consultaRepository = new ConsultaRepository();
    private EmailService emailService = new EmailService();

    public boolean marcarConsulta(Paciente paciente, Medico medico, String data, String hora) {

        // 1. REGRA DE NEGÓCIO: Checar conflito de horário para o médico.
        boolean conflito = consultaRepository.buscarTodasConsultas().stream()
                .anyMatch(c -> c.getProntuario().getMedico().equals(medico)
                        && c.getProntuario().getData().equals(data)
                        && c.getProntuario().getHora().equals(hora)
                        && c.getStatus() == StatusDeConsulta.AGENDADA);

        if (conflito) {
            System.err.println(
                    "ERRO DE NEGÓCIO: O médico " + medico.getNomeCompleto() + " já está ocupado neste horário.");
            return false;
        }

        // 2. Criação do Prontuário e Consulta (Entidades)
        Prontuario novoProntuario = new Prontuario(null, paciente, medico, data, hora, "", "", "", "", "");
        Consulta consulta = new Consulta(novoProntuario, StatusDeConsulta.AGENDADA);
        consultaRepository.SalvarConsulta(consulta);

        // 4. LÓGICA AUXILIAR: Envia notificação
        emailService.enviarEmail(medico, paciente, "Agendamento Confirmado",
                "Sua consulta foi marcada para " + data + " às " + hora);

        System.out.println("SUCESSO: Consulta marcada para " + paciente.getNomeCompleto());
        return true;
    }

    public void realizarConsulta(Consulta consulta, String diagnostico, String tratamento, String exame,
            String medicacao) {
        // 1. REGRA DE NEGÓCIO: A consulta deve estar AGENDADA ou EM_ANDAMENTO
        if (consulta.getStatus() != StatusDeConsulta.AGENDADA
                && consulta.getStatus() != StatusDeConsulta.EM_ANDAMENTO) {
            System.err.println("ERRO DE NEGÓCIO: A consulta não está agendada ou em andamento.");
            return;
        }

        // 2. Atualização do Prontuário
        consulta.getProntuario().setDiagnostico(diagnostico);
        consulta.getProntuario().setTratamento(tratamento);
        consulta.getProntuario().setExame(exame);
        consulta.getProntuario().setMedicacao(medicacao);

        // 3. Atualização do Status da Consulta
        consulta.setStatus(StatusDeConsulta.CONCLUIDA);

        // 4. LÓGICA AUXILIAR: Envia notificação
        emailService.enviarEmail(consulta.getProntuario().getMedico(), consulta.getProntuario().getPaciente(),
                "Consulta realizada", "A consulta foi realizada com sucesso");

        System.out.println(
                "SUCESSO: Consulta realizada para " + consulta.getProntuario().getPaciente().getNomeCompleto());
    }

    // Correção do método de Cancelamento
    public boolean cancelarConsulta(Consulta consulta) {
        if (consulta.getStatus() != StatusDeConsulta.AGENDADA) {
            System.err.println("ERRO DE NEGÓCIO: A consulta não está agendada.");
            return false;
        }

        // 2. Atualização do Status da Consulta
        consulta.setStatus(StatusDeConsulta.CANCELADA);

        // 3. LÓGICA AUXILIAR: Envia notificação
        boolean removido = consultaRepository.RemoverConsulta(consulta);

        if (removido) {
            System.out.println(
                    "SUCESSO: Consulta cancelada para " + consulta.getProntuario().getPaciente().getNomeCompleto());
            return true;
        } else {
            System.err.println("ERRO: Falha ao cancelar a consulta.");
            return false;
        }
    }

    public List<Consulta> listarConsultas() {
        return consultaRepository.listarConsultas();
    }
}
