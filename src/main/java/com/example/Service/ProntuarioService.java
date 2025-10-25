package com.example.Service;

import java.util.ArrayList;
import java.util.List;

import com.example.entity.Prontuario;

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
