package com.example.Repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.example.entity.Consulta;

public class ConsultaRepository {

   public List<Consulta> buscarTodasConsultas() {
    EntityManager em = JPAUtil.getEntityManager();
    try {
        TypedQuery<Consulta> query = em.createQuery("SELECT c FROM Consulta c", Consulta.class);
        return query.getResultList();
    } finally {
        em.close();
    }
   }
    // Salvar consulta
    public void salvarConsulta(Consulta consulta) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(consulta);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Erro ao salvar consulta", e);
        } finally {
            em.close();
        }
    }

    // Listar todas as consultas
    public List<Consulta> listarConsultas() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            TypedQuery<Consulta> query = em.createQuery("SELECT c FROM Consulta c", Consulta.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    // Remover consulta
    public boolean removerConsulta(Consulta consulta) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            Consulta c = em.find(Consulta.class, consulta.getId());
            if (c == null) {
                em.getTransaction().rollback();
                return false;
            }
            em.remove(c);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new RuntimeException("Erro ao remover consulta", e);
        } finally {
            em.close();
        }
    }

    // Buscar consulta por ID (objeto)
    public Consulta buscarConsultaObjeto(Consulta consulta) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Consulta.class, consulta.getId());
        } finally {
            em.close();
        }
    }
}
