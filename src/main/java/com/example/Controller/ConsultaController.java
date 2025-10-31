package com.example.Controller;

import java.util.List;

import com.example.entity.Consulta;
import com.example.entity.Medico;
import com.example.entity.Paciente;

public interface ConsultaController {
    
    public void agendarConsulta(Paciente paciente, Medico medico, String data, String hora);

    public List<Consulta> listarConsultas();
}
