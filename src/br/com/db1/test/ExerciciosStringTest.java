package br.com.db1.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.ExerciciosString;

public class ExerciciosStringTest {

	private ExerciciosString exerciciosString = new ExerciciosString();

	@Before
	public void before(){
		System.out.println("Inicio de 1 teste");
	}
	@After 
	public void after(){
		System.out.println("Fim de 1 teste");
		
	}
	@Test
	public void maiusculoTest() {
		Assert.assertTrue(exerciciosString.maiusculo("teste").equals("TESTE"));

	}

	@Test
	public void minusculoTest() {
		Assert.assertTrue(exerciciosString.minusculo("TESTE").equals("teste"));
	}

	@Test
	public void contagemTest() {
		Assert.assertTrue(8 == exerciciosString.contagemCaracteres("DB1Start"));
	}

	@Test
	public void contagemComEspacoTest() {
		Assert.assertTrue(10 == exerciciosString.contagemCaracteres(" DB1Start "));
	}

	@Test
	public void contagemSemEspacoTest() {
		Assert.assertTrue(8 == exerciciosString.contagemSemEspaco(" DB1Start "));
	}

	@Test
	public void exibirLetrasTest() {
		Assert.assertTrue(exerciciosString.exibirLetra("JOAO LUCAS ZANNE").equals("JOAO"));
	}

	@Test
	public void exibirLetras1Test() {
		Assert.assertTrue(exerciciosString.exibirLetra1("JOAO LUCAS ZANNE").equals("O LUCAS ZANNE"));
	}

	@Test
	public void exibirLetras2Test() {
		Assert.assertTrue(exerciciosString.exibirLetra2("JOAO LUCAS ZANNE").equals("ANNE"));
	}

	@Test
	public void trocarNomeTest() {
		Assert.assertTrue(exerciciosString.trocarNome("JOAO LUCAS ZANNE").equals("ALUNO LUCAS ZANNE"));
	}

	@Test
	public void frutasTeste() {
		Assert.assertTrue(exerciciosString.frutas("Banana, Maca, Melancia").equals("Banana Maca Melancia"));
	}

	@Test
	public void contarVogaisTeste() {
		Assert.assertTrue(2 == exerciciosString.contarVogais("Lucas"));
	}

	@Test
	public void nomeInversoTest(){
		Assert.assertTrue(exerciciosString.nomeInverso("joao").equals("oaoj"));
	}
}	
