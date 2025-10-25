package com.example.entity;
public class Medico extends PessoaBase {
    private String crm;
    private String especialidade;

    public Medico(){

    }
    
    public Medico(String nomeCompleto, Integer idade, String cpf, String email, String telefone, String endereco,
            String cidade, String estado, String pais, String cep, String crm, String especialidade) {
        super(nomeCompleto, idade, cpf, email, telefone, endereco, cidade, estado, pais, cep);
        this.crm = crm;
        this.especialidade = especialidade;
    }


    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return super.toString() + "Medico [crm=" + crm + ", especialidade=" + especialidade + "]";
    }
}
