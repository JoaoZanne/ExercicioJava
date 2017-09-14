package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosDate;

public class ExerciciosDateTest {

	ExerciciosDate exerciciosDate = new ExerciciosDate();
	
	@Test
	public void anoBissextoTest(){
		Assert.assertTrue(exerciciosDate.anoBissexto(2018).equals(false));
		Assert.assertTrue(exerciciosDate.anoBissexto(2020).equals(true));
		
	}

}
