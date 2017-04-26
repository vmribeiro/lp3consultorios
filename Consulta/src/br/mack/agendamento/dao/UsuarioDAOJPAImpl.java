/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.agendamento.dao;

import br.mack.agendamento.modelo.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author rabah
 */
public class UsuarioDAOJPAImpl implements UsuarioDAO {

    @Override
    public List<Usuario> findAll() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConsultaPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query q = em.createQuery("select u from Usuario u");
        List<Usuario> result = null;
        result = q.getResultList();
        em.getTransaction().commit();
        em.clear();
        em.close();
        emf.close();

        return result;
    }

    @Override
    public Usuario findById(long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConsultaPU");
        EntityManager em = emf.createEntityManager();
        Usuario u = em.find(Usuario.class, id);
        em.clear();
        em.close();
        emf.close();
        return u;
    }

    @Override
    public Usuario create(Usuario usuario) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConsultaPU");
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
            em.clear();
            em.close();
            emf.close();
            return usuario;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean remove(Usuario usuario) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UsuarioPU");
        EntityManager em = emf.createEntityManager();
        long id = usuario.getId();
        try {
            em.getTransaction().begin();
            Usuario u = em.find(Usuario.class, id);
            em.remove(u);
            em.getTransaction().commit();
            em.clear();
            em.close();
            emf.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean removeById(long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UsuarioPU");
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Usuario u = em.find(Usuario.class, id);
            em.remove(u);
            em.getTransaction().commit();
            em.clear();
            em.close();
            emf.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean update(Usuario usuario) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UsuarioPU");
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            usuario = em.merge(usuario);
            em.getTransaction().commit();
            em.clear();
            em.close();
            emf.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
