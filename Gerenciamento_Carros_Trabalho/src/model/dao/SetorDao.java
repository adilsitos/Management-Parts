/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import model.Setor;
import model.connection.ConnectionFactory;

/**
 *
 * @author adils
 */
public class SetorDao {
    public Setor save(Setor setor){
        EntityManager em = new ConnectionFactory().getConnection();
        try{
            em.getTransaction().begin();
            if(setor.getId() == null){ 
                em.merge(setor);
            }else{
                em.persist(setor);
            }
            em.getTransaction().commit();
        }catch(Exception e){
             System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return setor;
    }
    
    public Setor findById(Integer id){
        
        EntityManager em = new ConnectionFactory().getConnection();
        Setor setor = null;
        
        try{
            setor = em.find(Setor.class, id);
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        return setor;
    }
        
    public List<Setor> findAll(){
        EntityManager em = new ConnectionFactory().getConnection();
        List<Setor> setores = null;
        try{
            setores = em.createQuery("from Setor c").getResultList();
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        
        return setores;
    }
      
    public Setor remove(Integer id){
        EntityManager em = new ConnectionFactory().getConnection();
        Setor setor = null;

        try{
           setor = em.find(Setor.class, id);
           em.getTransaction().begin();
           em.remove(setor);
           em.getTransaction().commit();
        }catch(Exception e){
           System.err.println(e);
           em.getTransaction().rollback();
        }finally{
           em.close();
        }
        return setor;
    }
}
