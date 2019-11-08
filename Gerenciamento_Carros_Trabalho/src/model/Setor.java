/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author adils
 */
@Entity
public class Setor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomeSetor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
  

    

    public String getNomeSetor() {
        return nomeSetor;
    }

    public void setNomeSetor(String nomeSetor) throws Exception{
    	if(nomeSetor.length() < 2 || nomeSetor.length() > 45 ) {
    		throw new Exception();
    	}
        this.nomeSetor = nomeSetor;
    }
    
}
