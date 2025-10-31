package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pacientes")
public class Paciente extends PessoaBase {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoSanguineo;
    private String alergias;
    private String medicamentos;
    private String historicoMedico;
    private String historicoFamiliar;
    private String historicoSocial;
    private String historicoAlimentar;
    private String historicoPsicologico;

    public Paciente(String nomeCompleto, Integer idade, String cpf, String email, String telefone, String endereco, String cidade, String estado, String pais, String cep, String tipoSanguineo, String alergias, String medicamentos, String historicoMedico, String historicoFamiliar, String historicoSocial, String historicoAlimentar, String historicoPsicologico) {
        super(nomeCompleto, idade, cpf, email, telefone, endereco, cidade, estado, pais, cep);
        this.tipoSanguineo = tipoSanguineo;
        this.alergias = alergias;
        this.medicamentos = medicamentos;
        this.historicoMedico = historicoMedico;
        this.historicoFamiliar = historicoFamiliar;
        this.historicoSocial = historicoSocial;
        this.historicoAlimentar = historicoAlimentar;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
    
    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
    
    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }
    
    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }
    
    public String getHistoricoFamiliar() {
        return historicoFamiliar;
    }

    public void setHistoricoFamiliar(String historicoFamiliar) {
        this.historicoFamiliar = historicoFamiliar;
    }
    
    public String getHistoricoSocial() {
        return historicoSocial;
    }

    public void setHistoricoSocial(String historicoSocial) {
        this.historicoSocial = historicoSocial;
    }
    
    public String getHistoricoAlimentar() {
        return historicoAlimentar;
    }
    
    public void setHistoricoAlimentar(String historicoAlimentar) {
        this.historicoAlimentar = historicoAlimentar;
    }
    
    public String getHistoricoPsicologico() {
        return historicoPsicologico;
    }
    
    public void setHistoricoPsicologico(String historicoPsicologico) {
        this.historicoPsicologico = historicoPsicologico;
    }
    
    @Override
    public String toString() {
        return "Paciente [tipoSanguineo=" + tipoSanguineo + ", alergias=" + alergias + ", medicamentos=" + medicamentos + ", historicoMedico=" 
        + historicoMedico + ", historicoFamiliar=" + historicoFamiliar + ", historicoSocial=" + historicoSocial + ", historicoAlimentar=" 
        + historicoAlimentar + ", historicoPsicologico=" + historicoPsicologico + "]";
    }
}
