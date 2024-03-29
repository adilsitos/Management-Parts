/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author adils
 */
@Entity
public class Peca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPeca;
    private int quantidadePeca;
    private int precoPeca;
    @ManyToOne()
    private Fabricante fabricante;
     //private int idFabricante;
    @ManyToOne()
    private Setor setor;
    //private int idSetor;
    private String nomePeca;


    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }
   
    public int getQuantidadePeca() {
        return quantidadePeca;
    }

    public void setQuantidadePeca(int quantidadePeca) throws Exception{
    	/*if(quantidadePeca == null) {
    		throw new Exception();	
    	}
    	  	 
    	if(quantidadePeca%2 =!0) {
    		throw new Exception();	
    		
    		
    	}
    	
    	if(quantidadePeca == char ) {
    		throw new Exception();	
    		
    		
    	}
    	if(quantidadePeca =! int ) {
    		throw new Exception();	
    		
    		
    	}
    	if(quantidadePeca == 2147483648 ) {
    		throw new Exception();	
    		
    		
    	}
    	
    	
    */

    	
    	if(quantidadePeca < 0) {
    		throw new Exception();
    		
    	}
    	
        this.quantidadePeca = quantidadePeca;
    }
   
    public int getPrecoPeca() {
        return precoPeca;
    }

    public void setPrecoPeca(int precoPeca) throws Exception{
    	if(precoPeca <= 0) {
    		throw new Exception();
    	}
        this.precoPeca = precoPeca;        
    }

   

    public String getNomePeca() {
        return nomePeca;
    }

    public void setNomePeca(String nomePeca) throws Exception{
    	if(nomePeca.length() < 4 || nomePeca.length() > 45) {
    		throw new Exception();
    		
    	}
        this.nomePeca = nomePeca;
    }

    public Integer getIdPeca() {
        return idPeca;
    }

    public void setIdPeca(Integer idPeca) {
        this.idPeca = idPeca;
    }
    
    
}
