package com.example.entity;

public class PessoaBase {
    private String nomeCompleto;
    private Integer idade;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;

    public PessoaBase(){

    }

    public PessoaBase(String nomeCompleto, Integer idade, String cpf, String email,
            String telefone, String endereco, String cidade, String estado, String pais, String cep) {
        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "PessoaBase [nomeCompleto=" + nomeCompleto + ", idade=" + idade + ", cpf=" + cpf + ", email=" 
        + email + ", telefone=" + telefone + ", endereco=" + endereco + ", cidade=" + cidade + ", estado=" 
        + estado + ", pais=" + pais + ", cep=" + cep + "]";
    }
    


}
