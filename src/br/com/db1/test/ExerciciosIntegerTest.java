package br.com.db1.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.ExerciciosInteger;

public class ExerciciosIntegerTest {

	private ExerciciosInteger exercicioInteger = new ExerciciosInteger();
	@Before
	public void before(){
		System.out.println("Inicio de 1 teste");
	}
	@After 
	public void after(){
		System.out.println("Resultado:" + exercicioInteger.exibirResultado());
		System.out.println("Fim de 1 teste");
		
	}

	@Test
	public void somarTest() {
		Assert.assertTrue(7 == exercicioInteger.somar(4, 3));

	}

	@Test
	public void subtrairTest() {
		Assert.assertTrue(1 == exercicioInteger.subtrair(4, 3));

	}
	@Test
	public void multiplicarTest(){
		Assert.assertTrue(12 == exercicioInteger.multiplicar(4, 3));
		
	}
	@Test
	public void dividirTest(){
		Assert.assertTrue(2 == exercicioInteger.dividir(4, 2));
		
	}
	@Test
	public void numeroParTest(){
		exercicioInteger.numeroPar(6);
		Assert.assertTrue(0 == exercicioInteger.numeroPar(6));
		
	}
	@Test 
	public void numeroMaiorTest(){
		Assert.assertTrue(9 == exercicioInteger.numeroMaior(9, 6));
	}

	@Test
	public void numerosImpares() {
		Assert.assertTrue(5 == exercicioInteger.numerosImpares(90)); 
		
	}
	 

}
