package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosDouble;

public class ExerciciosDoubleTest {
	ExerciciosDouble exerciciosDouble = new ExerciciosDouble();

	@Test
	public void menorValorTest() {
		Assert.assertTrue(6d == exerciciosDouble.menorValor(6d, 8d));
		Assert.assertTrue(4d == exerciciosDouble.menorValor(10d, 4d));
	}

	@Test
	public void menorValorTresNumerosTest() {
		Assert.assertTrue(6d == exerciciosDouble.menorValorTresNumeros(6d, 8d, 9d));
		Assert.assertTrue(10d == exerciciosDouble.menorValorTresNumeros(12d, 10d, 15d));
		Assert.assertTrue(9d == exerciciosDouble.menorValorTresNumeros(16d, 20d, 9d));
	}

	@Test
	public void mediaTest(){
		Assert.assertTrue(4d == exerciciosDouble.media(2d, 4d, 6d));
		
	}
	@Test 
	public void areaTest(){
		Assert.assertTrue(4d == exerciciosDouble.area(2d, 4d));
		
	}
}