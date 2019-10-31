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

/**
 *
 * @author adils
 */
@Entity
public class Fabricante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFabricante;
    private String nomeFabricante;
    private String emailFabricante;

    public Integer getIdFabricante() {
        return idFabricante;
    }

    public void setIdFabricante(Integer idFabricante) throws Exception {
    	if(idFabricante == null || idFabricante<=0 || idFabricante > 2147483647) {
    		throw new Exception();
    	}
        this.idFabricante = idFabricante;
    }

    
    public String getNomeFabricante() {
        return nomeFabricante;
    }

    public void setNomeFabricante(String nomeFabricante) {
        this.nomeFabricante = nomeFabricante;
    }

    public String getEmailFabricante() {
        return emailFabricante;
    }

    public void setEmailFabricante(String emailFabricante) {
        this.emailFabricante = emailFabricante;
    }
    
}
