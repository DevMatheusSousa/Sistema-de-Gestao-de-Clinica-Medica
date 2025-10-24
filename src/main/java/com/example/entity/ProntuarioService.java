package com.example.entity;

import java.util.ArrayList;
import java.util.List;

public class ProntuarioService {
    
    private List<Prontuario> prontuarios = new ArrayList<Prontuario>();
    

    public void adicionarProntuario(Prontuario prontuario) {
        prontuarios.add(prontuario);
        System.out.println("Prontuario adicionado com sucesso");
    }

    public void listarProntuarios() {
        for (Prontuario prontuario : prontuarios) {
            System.out.println(prontuario);
        }
    }
}
