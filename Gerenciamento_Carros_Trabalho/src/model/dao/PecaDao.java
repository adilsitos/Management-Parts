/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import model.Peca;
import model.Setor;
import model.connection.ConnectionFactory;

/**
 *
 * @author adils
 */
public class PecaDao { 
        public Peca save(Peca peca){
        EntityManager em = new ConnectionFactory().getConnection();
        try{
            em.getTransaction().begin();
            if(peca.getIdPeca() == null){ 
                em.merge(peca); //adiciona no banco
            }else{
                em.persist(peca); // realiza update no banco
            }
            em.getTransaction().commit();
        }catch(Exception e){
             System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return peca;
    }
    
        public Peca findById(Integer id){ // faz consulta por id
        
        EntityManager em = new ConnectionFactory().getConnection();
        Peca peca = null;
        
        try{
            peca = em.find(Peca.class, id);
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        return peca;
    }
        
      public List<Peca> findAll(){ // select de todos o valores da coluna peças
        EntityManager em = new ConnectionFactory().getConnection();
        List<Peca> pecas = null;
        try{
            pecas = em.createQuery("from Peca c").getResultList();
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        
        return pecas;
    }
      
          public Peca remove(Integer id){ // remove do banco por id 
            EntityManager em = new ConnectionFactory().getConnection();
            Peca peca = null;

        try{
           peca = em.find(Peca.class, id);
            em.getTransaction().begin();
            em.remove(peca);
            em.getTransaction().commit();
        }catch(Exception e){
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return peca;
    }

}
