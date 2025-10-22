package com.example.entity;

import com.example.enums.StatusDeConsulta;

public class Consulta {
    private Medico medico;
    private Paciente paciente;
    private String data;
    private String hora;
    private StatusDeConsulta status;
    private String observacoes;
    private String diagnostico;
    private String tratamento;
    private String exame;
    private String medicacao;

    public Consulta(Paciente paciente, String data, String hora, String observacoes, 
    String diagnostico, String tratamento, String exame, String medicacao, StatusDeConsulta status) {
        this.paciente = paciente;
        this.data = data;
        this.hora = hora;
        this.status = status.EM_ANDAMENTO;
        this.observacoes = observacoes;
        this.diagnostico = diagnostico;
        this.tratamento = tratamento;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public StatusDeConsulta getStatus() {
        return status;
    }

    public void setStatus(StatusDeConsulta status) {
        this.status = status;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    public String getExame() {
        return exame;
    }

    public void setExame(String exame) {
        this.exame = exame;
    }

    public String getMedicacao() {
        return medicacao;
    }

    public void setMedicacao(String medicacao) {
        this.medicacao = medicacao;
    }

    @Override
    public String toString() {
        return "Consulta [medico=" + medico + ", paciente=" + paciente + ", data=" + data + ", hora=" + hora 
        + ", status=" + status + ", observacoes=" + observacoes + ", diagnostico=" + diagnostico + ", tratamento=" 
        + tratamento + ", exame=" + exame + ", medicacao=" + medicacao + "]";
    }
}
