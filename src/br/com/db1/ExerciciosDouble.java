package br.com.db1;

public class ExerciciosDouble {

	public Double menorValor(Double valor1, Double valor2) {
		if (valor1 < valor2) {
			return valor1;
		} else {
			return valor2;
		}
	}

	public Double menorValorTresNumeros(Double valor1, Double valor2, Double valor3) {
		if (valor1 < valor2 && valor1 < valor3) {
			return valor1;
		} else if (valor2 < valor1 && valor2 < valor3) {
			return valor2;
		} else {
			return valor3;
		}
	}

	public Double media(Double valor1, Double valor2, Double valor3){
		return (valor1+valor2+valor3)/3;
	}
	public Double area(Double base, Double altura){
		return (base*altura)/2;
		
	}



}
