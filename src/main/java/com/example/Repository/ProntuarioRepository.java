package com.example.Repository;

import java.util.ArrayList;
import java.util.List;

import com.example.entity.Prontuario;

public class ProntuarioRepository {
    private List<Prontuario> prontuarios = new ArrayList<>();

    public void SalvarProntuario(Prontuario prontuario) {
        prontuarios.add(prontuario);
    }

    public List<Prontuario> buscarProntuarios() {
        return new ArrayList<>(this.prontuarios);
    }

    public void RemoverProntuario(Prontuario prontuario) {
        prontuarios.remove(prontuario);
    }

    public Prontuario buscarProntuarioPbejto(Prontuario prontuario) {
        return prontuarios.stream()
        .filter(p -> p.equals(prontuario))
        .findFirst()
        .orElse(null);
    }
}
