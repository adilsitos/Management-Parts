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
    private String cpfPessoa;
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

    public void setSetor(Setor setor){
        this.setor = setor;
    }
    public String getLoginPessoa() {
        return loginPessoa;
    }

    public void setLoginPessoa(String loginPessoa) throws Exception{
        if(loginPessoa.length()<4 || loginPessoa.length()>15){
            throw new Exception ("login inválido");
        }
        this.loginPessoa = loginPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) throws Exception {
        if(nomePessoa == null){
        System.out.println("nome inválido");
        throw new Exception("nome inválido");
    }
	if(nomePessoa.length() < 5){
         System.out.println("nome inválido");
         throw new Exception("nome inválido");
     }
     if(!nomePessoa.matches("[a-zA-Z]+")){
         System.out.println("nome inválido");
         throw new Exception("nome inválido");
     }
    if(nomePessoa.length() > 45){
         System.out.println("nome inválido");
         throw new Exception("nome inválido");
     }
        this.nomePessoa = nomePessoa;
    }

    public int getIdadePessoa() {
        return idadePessoa;
    }

    public void setIdadePessoa(int idadePessoa) throws Exception{
        if(idadePessoa <=0 || idadePessoa >100){
            throw new Exception ("idade inválida");
        }
        this.idadePessoa = idadePessoa;
    }

    public int getRgPessoa() {
        return rgPessoa;
    }

    public void setRgPessoa(int rgPessoa) throws Exception {
	if (rgPessoa < 100000000 || rgPessoa > 999999999){
		System.out.println("rg inválido");
		throw new Exception("rg inválido");
	}        
        this.rgPessoa = rgPessoa;
    }

    public String getCpfPessoa() {
        return cpfPessoa;
    }

    public void setCpfPessoa(String cpfPessoa) throws Exception{
     if(!cpfPessoa.matches("[0-9]{11}")){
         System.out.println("cpf inválido");
         throw new Exception("cpf inválido");
     }
        this.cpfPessoa = cpfPessoa;
    }

    public String getEmailPessoa() {
        return emailPessoa;
    }

    public void setEmailPessoa(String emailPessoa) throws Exception{
    if(emailPessoa == null){
        System.out.println("email inválido");
         throw new Exception("email inválido");
    }
	if(emailPessoa.length() < 5){
         System.out.println("email inválido");
         throw new Exception("email inválido");
     }
     if(!emailPessoa.matches(".+@.+")){
         System.out.println("email inválido");
         throw new Exception("email inválido");
     }
    if(emailPessoa.length() > 45){
         System.out.println("email inválido");
         throw new Exception("email inválido");
     }
        this.emailPessoa = emailPessoa;
    }

    public String getSenhaPessoa() {
        return senhaPessoa;
    }

    public void setSenhaPessoa(String senhaPessoa) throws Exception{
        if(senhaPessoa.length() < 5 || senhaPessoa.length() > 20){
            throw new Exception("senha inválida");
        }
        this.senhaPessoa = senhaPessoa;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) throws Exception{
        if(horasTrabalhadas <=0 || horasTrabalhadas >999){
            throw new Exception ("horas inválidas");
        }
        this.horasTrabalhadas = horasTrabalhadas;
    }

    
    public int getSalarioPessoa() {
        return salarioPessoa;
    }

    public void setSalarioPessoa(int salarioPessoa) throws Exception{
        if(salarioPessoa <=0 || salarioPessoa >9999999){
            throw new Exception ("salario inválido");
        } 
            this.salarioPessoa = salarioPessoa;
    }
    
    
}
