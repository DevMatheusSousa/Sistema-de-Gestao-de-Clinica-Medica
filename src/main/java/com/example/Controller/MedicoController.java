package com.example.Controller;

import com.example.Service.MedicoService;
import com.example.entity.Medico;

public class MedicoController {
    private MedicoService medicoService = new MedicoService();

    public void listarMedicos(){
        medicoService.listarMedicos();
    }

    public void cadastrarMedico(Medico medico){
        medicoService.cadastrarMedico(medico);
    }
}
