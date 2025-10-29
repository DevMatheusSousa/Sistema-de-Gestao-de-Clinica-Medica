package com.example.Repository;

import java.util.ArrayList;
import java.util.List;

import com.example.entity.Consulta;
import com.example.entity.Prontuario;

public class ConsultaRepository {
    /** * Repository: Responsável EXCLUSIVAMENTE pela manipulação do banco de dados (aqui, listas em memória).
 */

 private List<Consulta> consultas = new ArrayList<>();
 
 public void SalvarConsulta(Consulta consulta) {
    consultas.add(consulta);
 }


 public void listarConsultas() {
   for (Consulta consulta : consultas) {
       System.out.println(consulta);
   }
}

 public boolean RemoverConsulta(Consulta consulta) {
    return consultas.remove(consulta);
 }


 // Método auxiliar para o Service: buscar uma consulta específica por objeto.
 public Consulta buscarConsultaObjeto(Consulta consulta) {
    return consultas.stream()
    .filter(c -> c.equals(consulta)) // Assume que Consulta tem um bom equals/hashCode
    .findFirst()
    .orElse(null);
 }

 public List<Consulta> buscarTodasConsultas() {
    return new ArrayList<>(consultas);
 }
}
