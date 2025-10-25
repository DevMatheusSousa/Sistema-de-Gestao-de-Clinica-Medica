package com.example.Controller;

import java.util.ArrayList;
import java.util.List;

import com.example.Service.ConsultaService;
import com.example.entity.Consulta;

public class ConsultaController {
    List<Consulta> consultas = new ArrayList<Consulta>();

    public void listarConsultas(Consulta consulta){
        consultas.add(consulta);
        for(Consulta consultaDoHospital : consultas) {
            System.out.println(consultaDoHospital);
        }
    }
    
}
