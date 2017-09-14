package br.com.db1;

import java.util.Date;

public class ExerciciosDate {

	public Boolean anoBissexto(Integer ano) {
		if (ano % 400 == 0) {
			return true;
		} else if ((ano % 4 == 0) & (ano % 100 != 0)) {
			return true;

		} else {
			return false;
		}

	}

	public Boolean