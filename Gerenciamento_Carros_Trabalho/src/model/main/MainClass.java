/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.main;

import model.Pessoa;
import model.Setor;
import model.dao.PessoaDao;
import model.dao.SetorDao;

/**
 *
 * @author adils
 */
public class MainClass {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        SetorDao sDao = new SetorDao();
        PessoaDao pDao = new PessoaDao();
        Setor s = new Setor();
        //s.setNomeSetor("Alimento");
        s.setId(1);
        p.setSetor(s);
        //os erros sao pq ta faltando try
        p.setLoginPessoa("Luizao2");
        p.setNomePessoa("luizao kunnn");
        //p.setLoginPessoa(jTextField3.getText());
        p.setEmailPessoa("DASD");
        p.setIdadePessoa(18);
        p.setCpfPessoa(85225);
        p.setRgPessoa(852452);
        p.setSenhaPessoa("422452");
        //s.setNomeSetor();
        //p.setId(1);
        p.setHorasTrabalhadas(0);
        p.setSalarioPessoa(0);
        
        pDao.save(p);
    }
}
