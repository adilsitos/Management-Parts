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
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;    
    private String loginPessoa;
    private String nomePessoa;
    private int idadePessoa;
    private int rgPessoa;
    private int cpfPessoa;
    private String emailPessoa;
    private String senhaPessoa;
    private int horasTrabalhadas;
    @ManyToOne
    private Setor setor;
    private int salarioPessoa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }
    public String getLoginPessoa() {
        return loginPessoa;
    }

    public void setLoginPessoa(String loginPessoa) {
        this.loginPessoa = loginPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public int getIdadePessoa() {
        return idadePessoa;
    }

    public void setIdadePessoa(int idadePessoa) {
        this.idadePessoa = idadePessoa;
    }

    public int getRgPessoa() {
        return rgPessoa;
    }

    public void setRgPessoa(int rgPessoa) {
        this.rgPessoa = rgPessoa;
    }

    public int getCpfPessoa() {
        return cpfPessoa;
    }

    public void setCpfPessoa(int cpfPessoa) {
        this.cpfPessoa = cpfPessoa;
    }

    public String getEmailPessoa() {
        return emailPessoa;
    }

    public void setEmailPessoa(String emailPessoa) {
        this.emailPessoa = emailPessoa;
    }

    public String getSenhaPessoa() {
        return senhaPessoa;
    }

    public void setSenhaPessoa(String senhaPessoa) {
        this.senhaPessoa = senhaPessoa;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    
    public int getSalarioPessoa() {
        return salarioPessoa;
    }

    public void setSalarioPessoa(int salarioPessoa) {
        this.salarioPessoa = salarioPessoa;
    }
    
    
}
