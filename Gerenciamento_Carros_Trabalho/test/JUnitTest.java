/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class JUnitTest {
   
    //teste para Pecas
    model.Peca p = new model.Peca();
    @Test
    public void testPecas1() {
	try {
		p.setQuantidadePeca(-1);
		fail("Erro: valor de quantidade de peca invalido");
		}
	
		catch(Exception e) {
			assertEquals(1,1);
		}
	
}


@Test
public void testPecas2(){
	try {
		p.setQuantidadePeca(-1);
		fail("Erro: valor de quantidade de peca invalido");
		}
	
		catch(Exception e) {
			assertEquals(1,1);
		}
}

// teste para setor

	model.Setor s = new model.Setor();
@Test
public void testSetor1(){
	try {
		s.setNomeSetor("a");
		fail("Erro:nome setor muito curto");
		}
	
		catch(Exception e) {
			assertEquals(1,1);
		}
}

 @Test	
    public void testSetor2(){
        try {
            s.setNomeSetor("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            fail("Erro:nome setor muito grande");
        }
		
			catch(Exception e) {
				assertEquals(1,1);
			}
	}

 // Teste para Pessoa
 model.Pessoa pe = new model.Pessoa();


 @Test
 public void testPessoa1() {
     model.Pessoa p = new model.Pessoa();
     try{
         p.setLoginPessoa("aaa");
         fail();
     }catch(Exception e){
         assertEquals(e.getMessage(),"login invalido");
     }
 }
 
 @Test
 public void testPessoa2() {
     try{
         pe.setNomePessoa("luis");
         fail();
     }catch(Exception e){
         assertEquals(e.getMessage(),"nome invalido");
     }
 }
 
 @Test
 public void testPessoa3() {
     try{
         pe.setNomePessoa("luisluisluisluisluisluisluisluisluisluisluisluis");
         fail();
     }catch(Exception e){
         assertEquals(e.getMessage(),"nome invalido");
     }
 }
 
 @Test
 public void testPessoa4() {
	 try {
		 pe.setRgPessoa(99999999);
		 fail();
	 }
	 catch(Exception e) {
		 assertEquals(e.getMessage(),"rg invalido");
	 }
 }
 
 @Test
 public void testPessoa5() {
	 try {
		 pe.setRgPessoa(1000000000);
		 fail();
	 }
	 catch(Exception e) {
		 assertEquals(e.getMessage(),"rg invalido");
	 }
 }
 
 @Test
 public void testPessoa6() {
	 try {
		 pe.setCpfPessoa("1234567891");
		 fail();
	 }
	 catch(Exception e) {
		 assertEquals(e.getMessage(),"cpf invalido");
	 }
 }
 
 @Test
 public void testPessoa7() {
	 try {
		 pe.setCpfPessoa("123456789123");
		 fail();
	 }
	 catch(Exception e) {
		 assertEquals(e.getMessage(),"cpf invalido");
	 }
 } 
 
 @Test
 public void testPessoa8() {
	 try {
		 pe.setEmailPessoa("aa@a");
		 fail();
	 }
	 catch(Exception e) {
		 assertEquals(e.getMessage(),"email muito curto");
	 }
 }
 
 @Test
 public void testPessoa9() {
	 try {
		 pe.setEmailPessoa("aaaaa");
		 fail();
	 }
	 catch(Exception e) {
		 assertEquals(e.getMessage(),"email invalido");
	 }
 }
 
 @Test
 public void testPessoa10() {
	 try {
		 pe.setEmailPessoa("aaaaaaaaaaaaaaaaaaaaaaaaa@aaaaaaaaaaaaaaaaaaaaaaaaa");
		 fail();
	 }
	 catch(Exception e) {
		 assertEquals(e.getMessage(),"email muito grande");
	 }
 }
 
 @Test
 public void testPessoa11() {
	 try {
		 pe.setSenhaPessoa("aaaa");
		 fail();
	 }
	 catch(Exception e) {
		 assertEquals(e.getMessage(),"senha invalida");
	 }
 }
 
 @Test
 public void testPessoa12() {
	 try {
		 pe.setSenhaPessoa("aaaaaaaaaaaaaaaaaaaaa");
		 fail();
	 }
	 catch(Exception e) {
		 assertEquals(e.getMessage(),"senha invalida");
	 }
 }
 
 @Test
 public void testPessoa13() {
	 try {
		 pe.setHorasTrabalhadas(0);
		 fail();
	 }
	 catch(Exception e) {
		 assertEquals(e.getMessage(),"horas invalidas");
	 }
 }
 
 @Test
 public void testPessoa14() {
	 try {
		 pe.setHorasTrabalhadas(1000);
		 fail();
	 }
	 catch(Exception e) {
		 assertEquals(e.getMessage(),"horas invalidas");
	 }
 }
 
 @Test
 public void testPessoa15() {
	 try {
		 pe.setSalarioPessoa(0);
		 fail();
	 }
	 catch(Exception e) {
		 assertEquals(e.getMessage(),"salario invalido");
	 }
 }
 
 @Test
 public void testPessoa16() {
	 try {
		 pe.setSalarioPessoa(10000000);
		 fail();
	 }
	 catch(Exception e) {
		 assertEquals(e.getMessage(),"salario invalido");
	 }
 }
 
 @Test
 public void testPessoa17() {
	 try {
		 pe.setIdadePessoa(0);
		 fail();
	 }
	 catch(Exception e) {
		 assertEquals(e.getMessage(),"idade invalida");
	 }
 }
 
 @Test
 public void testPessoa18() {
	 try {
		 pe.setIdadePessoa(101);
		 fail();
	 }
	 catch(Exception e) {
		 assertEquals(e.getMessage(),"idade invalida");
	 }
 }
 
 
 
 
}