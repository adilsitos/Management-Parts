/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import model.Fabricante;
import model.Peca;
import model.connection.ConnectionFactory;

/**
 *
 * @author adils
 */
public class FabricanteDao {
    public Fabricante save(Fabricante fabrica){
        EntityManager em = new ConnectionFactory().getConnection();
        try{
            em.getTransaction().begin();
            if(fabrica.getIdFabricante() == null){ 
                em.merge(fabrica); //adiciona no banco
            }else{
                em.persist(fabrica); // realiza update no banco
            }
            em.getTransaction().commit();
        }catch(Exception e){
             System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return fabrica;
    }
    
    public Fabricante findById(Integer id){ // faz consulta por id
        
        EntityManager em = new ConnectionFactory().getConnection();
        Fabricante fabrica = null;
        
        try{
            fabrica = em.find(Fabricante.class, id);
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        return fabrica;
    }
        
    public List<Fabricante> findAll(){ // select de todos o valores da coluna peças
        EntityManager em = new ConnectionFactory().getConnection();
        List<Fabricante> fabrica = null;
        try{
            fabrica = em.createQuery("from Fabricante c").getResultList();
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        
        return fabrica;
    }
      
    public Fabricante remove(Integer id){ // remove do banco por id 
            EntityManager em = new ConnectionFactory().getConnection();
            Fabricante fabrica = null;

        try{
           fabrica = em.find(Fabricante.class, id);
            em.getTransaction().begin();
            em.remove(fabrica);
            em.getTransaction().commit();
        }catch(Exception e){
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return fabrica;
    }
}
