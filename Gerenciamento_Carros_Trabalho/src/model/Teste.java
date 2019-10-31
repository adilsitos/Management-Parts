package model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Teste {

	Fabricante f = new Fabricante();

@Test
	public void test1() {
		try {
			f.setIdFabricante(1);
		}
		catch(Exception e){
			fail("error");
		}
		assertEquals(1,1);	
	} 

@Test
	public void test2() {
		try {
			f.setIdFabricante(0);
		}
		catch(Exception e){
			assertEquals(1,1);
		}
		//nao devera chegar nesta linha, algo esta errado
		fail("Erro");	
	} 

}
