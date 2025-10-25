package com.example.Service;

import com.example.entity.Medico;
import com.example.entity.Paciente;

public class EmailService {
    Medico medico = new Medico();

    public EmailService(){
        this.medico = medico;
    }
    
    public void enviarEmail(Medico medico, Paciente paciente, String assunto, String mensagem){
        System.out.println("Email enviado com sucesso para o paciente " + paciente.getNomeCompleto());
        System.out.println("Assunto: " + assunto);
        System.out.println("Mensagem: " + mensagem);
        System.out.println("Enviado por: " + medico.getNomeCompleto());
    }
}
