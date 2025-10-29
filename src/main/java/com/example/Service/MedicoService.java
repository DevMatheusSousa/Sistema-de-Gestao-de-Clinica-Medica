package com.example.Service;

import java.util.List;

import com.example.Repository.MedicoRepository;
import com.example.entity.Medico;

public class MedicoService {
    
// O Service PRECISA do Repository para persistir
private MedicoRepository medicoRepository = new MedicoRepository();
// Em projetos reais (Spring), você usaria @Autowired para injetar essa dependência.
public void adicionarMedico(Medico medico) {
    if(medico.getCrm() == null || medico.getCrm().length() < 5) {
        System.err.println("ERRO DE NEGÓCIO: CRM inválido. Médico não adicionado.");
        return;
    }

    // Delega a PERSISTÊNCIA para o Repository
    medicoRepository.Salvar(medico);
    System.out.println("Médico adicionado com sucesso");
}

public List<Medico> listarMedicos() {
    return medicoRepository.buscarMedicos();
}
}
