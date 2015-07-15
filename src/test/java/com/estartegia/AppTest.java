package com.estartegia;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class AppTest{
	Pessoa pessoa;
	
	@Before
	public void before(){
		pessoa = new Pessoa();
	}
	
	@Test
	public void testFaixa1(){
		pessoa.setRenda(1000);
		Assert.assertEquals(0.0,pessoa.calculaImpostoRenda());
	}
	
	@Test
	public void testFaixa2(){
		pessoa.setRenda(2000);
		Assert.assertEquals(150.0,pessoa.calculaImpostoRenda());
	}
	
	@Test
	public void testFaixa3(){
		pessoa.setRenda(3000);
		Assert.assertEquals(450.0,pessoa.calculaImpostoRenda());
	}
	
	@Test
	public void testFaixa4(){
		pessoa.setRenda(4000);
		Assert.assertEquals(900.0,pessoa.calculaImpostoRenda());
	}
	
	@Test
	public void testFaixa5(){
		pessoa.setRenda(5000);
		Assert.assertEquals(1375.0,pessoa.calculaImpostoRenda());
	}

}
