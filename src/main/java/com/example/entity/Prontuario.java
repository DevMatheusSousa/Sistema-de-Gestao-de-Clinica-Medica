package com.example.entity;

public class Prontuario  {
    private Consulta consulta;
    private Paciente paciente;
    private Medico medico;
    private String data;
    private String hora;
    private String observacoes;
    private String diagnostico;
    private String tratamento;
    private String exame;
    private String medicacao;

    public Prontuario(){
        
    }

    public Prontuario(Consulta consulta, Paciente paciente, Medico medico, String data, String hora, 
    String observacoes, String diagnostico, String tratamento, String exame, String medicacao) {
        this.consulta = consulta;
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.hora = hora;
        this.observacoes = observacoes;
        this.diagnostico = diagnostico;
        this.tratamento = tratamento;
        this.exame = exame;
        this.medicacao = medicacao;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
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
        //to String mais organizado
        return "Prontuario [consulta=" + consulta + ", paciente=" + paciente + ", medico=" + medico + ", data=" + data 
        + ", hora=" + hora + ", observacoes=" + observacoes + ", diagnostico=" + diagnostico + ", tratamento=" + tratamento + ", exame=" + exame 
        + ", medicacao=" + medicacao + "]";
    }
}
