package com.example.Controller;

import java.util.List;

import com.example.Service.ConsultaService;
import com.example.entity.Consulta;

public class ConsultaController {
    private final ConsultaService consultaService = new ConsultaService();

    public List<Consulta> listarConsultas(Consulta consulta) {
        return consultaService.listarConsultas();
    }
}
