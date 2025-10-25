package com.example.Controller;

import com.example.entity.MedicoService;

public class MedicoController {
    private MedicoService medicoService = new MedicoService();

    public void listarMedicos(){
        medicoService.listarMedicos();
    }
}
