/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import model.Pessoa;
import model.connection.ConnectionFactory;

/**
 *
 * @author adils
 */
public class PessoaDao {
    public Pessoa save(Pessoa pessoa){
        EntityManager em = new ConnectionFactory().getConnection();
        try{
            em.getTransaction().begin();
            if(pessoa.getId() == null){ 
                em.merge(pessoa); //adiciona no banco
            }else{
                em.persist(pessoa); // realiza update no banco
            }
            em.getTransaction().commit();
        }catch(Exception e){
             System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return pessoa;
    }
    
        public Pessoa findById(Integer id){ // faz consulta por id
        
        EntityManager em = new ConnectionFactory().getConnection();
        Pessoa pessoa = null;
        
        try{
            pessoa = em.find(Pessoa.class, id);
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        return pessoa;
    }
        
    public List<Pessoa> findAll(){ // select de todos o valores da coluna peças
        EntityManager em = new ConnectionFactory().getConnection();
        List<Pessoa> pessoa = null;
        try{
            pessoa = em.createQuery("from Pessoa c").getResultList();
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        
        return pessoa;
    }
      
    public Pessoa remove(Integer id){ // remove do banco por id 
            EntityManager em = new ConnectionFactory().getConnection();
            Pessoa pessoa = null;

        try{
            pessoa = em.find(Pessoa.class, id);
            em.getTransaction().begin();
            em.remove(pessoa);
            em.getTransaction().commit();
        }catch(Exception e){
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return pessoa;
    }
}
