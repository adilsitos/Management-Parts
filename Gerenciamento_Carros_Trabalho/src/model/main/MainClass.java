/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.main;

import model.Setor;
import model.dao.SetorDao;

/**
 *
 * @author adils
 */
public class MainClass {
    public static void main(String[] args) {
        Setor s = new Setor();
        s.setNomeSetor("Almoxarife3");
        SetorDao teste = new SetorDao();
        teste.save(s);
    }
}
