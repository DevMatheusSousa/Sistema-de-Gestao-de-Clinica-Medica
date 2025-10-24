package com.example.entity;

public abstract class Procedimento {
    private String nome;
    private String descricao;
    private Double valor;
    private Integer duracao;
    private String tipo;
    private String status;
    private String data;
    private String hora;
    private String local;

    public Procedimento(String nome, String descricao, Double valor, Integer duracao, String tipo, String status, String data, String hora, String local) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.duracao = duracao;
        this.tipo = tipo;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }
    
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
    
    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    

    @Override
    public String toString() {
        return "Procedimento [nome=" + nome + ", descricao=" + descricao + ", valor=" + valor + ", duracao=" + duracao 
        + ", tipo=" + tipo + ", status=" + status + ", data=" + data + ", hora=" + hora + ", local=" + local + "]";
    }
}
