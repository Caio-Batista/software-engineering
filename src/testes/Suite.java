package testes;

import org.junit.Before;
import org.junit.Test;

import principal.Calculadora;
import principal.Funcionario;

import static org.junit.Assert.*;


public class Suite {
	
	Funcionario caio,leticia,ze,joao,ninguem,pessoaalguma;
	Calculadora calculadora;

	
	@Before
	public void setup() {
		calculadora = new Calculadora();
		pessoaalguma = new Funcionario("Fulano", "x@gmail.com" , "DESENVOLVEDOR", 0);
		caio = new Funcionario("Caio", "caio@gmail.com" , "DESENVOLVEDOR", 5000);
		leticia = new Funcionario("Leticia", "leticia@gmail.com" , "TESTADOR", 8000);
		ze = new Funcionario("José", "ze@gmail.com" , "DBA", 2000);
		joao = new Funcionario("João", "joao@gmail.com" , "GERENTE", 6000);
	}
	
	
	@Test
	public void testNulo() {
		assertTrue(0 == calculadora.calculaFuncionario(ninguem));
		assertTrue(0 == calculadora.calculaFuncionario(pessoaalguma));
		assertFalse(0 == calculadora.calculaFuncionario(caio)); 
		assertFalse(0 == calculadora.calculaFuncionario(leticia));
		assertFalse(0 == calculadora.calculaFuncionario(ze));
		assertFalse(0 == calculadora.calculaFuncionario(joao));		
	}
	
	@Test
	public void testDesenvolvedor() {
		assertTrue(4000 == calculadora.calculaFuncionario(caio));
		caio.setSalarioBase(2000);
		assertTrue(1800 == calculadora.calculaFuncionario(caio));	
	}
	
	@Test
	public void testTestador() {
		assertTrue(6000 == calculadora.calculaFuncionario(leticia));
		leticia.setSalarioBase(1000);
		assertTrue(850 == calculadora.calculaFuncionario(leticia));	
	}
	
	
	@Test
	public void testDBA() {
		assertTrue(1500 == calculadora.calculaFuncionario(ze));
		ze.setSalarioBase(1000);
		assertTrue(850 == calculadora.calculaFuncionario(ze));	
	}
	
	@Test
	public void testGerente() {
		assertTrue(4200 == calculadora.calculaFuncionario(joao));
		joao.setSalarioBase(1000);
		assertTrue(800 == calculadora.calculaFuncionario(joao));	
	}	
	
	@Test
	public void testExtremo(){
		caio.setSalarioBase(0);
		leticia.setSalarioBase(0);
		ze.setSalarioBase(0);
		joao.setSalarioBase(0);
		
		assertTrue(0 == calculadora.calculaFuncionario(caio));
		assertTrue(0 == calculadora.calculaFuncionario(leticia));	
		assertTrue(0 == calculadora.calculaFuncionario(ze));	
		assertTrue(0 == calculadora.calculaFuncionario(joao));
	}
	
	
}
