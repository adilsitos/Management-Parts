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

/**
 *
 * @author LuluB
 */
public class JUnitTest {
    
    public JUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testPessoa1() {
        model.Pessoa p = new model.Pessoa();
        try{
            p.setLoginPessoa("aaa");
            fail();
        }catch(Exception e){
            assertEquals(e.getMessage(),"login inválido");
        }
    }
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
}
