package br.com.db1;

public class ExerciciosString {

	public String maiusculo(String palavra) {
		return palavra.toUpperCase();

	}

	public String minusculo(String palavra) {
		return palavra.toLowerCase();

	}

	public Integer contagemCaracteres(String DB1Start) {
		return DB1Start.length();
	}

	public Integer contagemSemEspaco(String palavra) {
		palavra = palavra.trim();
		return palavra.trim().length();
	}

	public String exibirLetra(String palavra) {
		return palavra.substring(0, 4);
	}

	public String exibirLetra1(String palavra) {
		return palavra.substring(3, 16);
	}

	public String exibirLetra2(String palavra) {
		return palavra.substring(12, 16);
	}

	public String trocarNome(String palavra) {
		return palavra.replace("JOAO", "ALUNO");

	}

	public String frutas(String palavra) {
		palavra = palavra.replace(", ", " ");
		return palavra;
	}

	public Integer contarVogais(String palavra) {
		int contarVogais = 0;
		palavra = palavra.toLowerCase();
		for (int i = 0; i < palavra.length(); i++) {
			char c = palavra.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				contarVogais++;
		}
		return contarVogais;
	}

	public String nomeInverso(String palavra){
		String fraseInvertida = new StringBuilder(palavra).reverse().toString();
		return fraseInvertida;
		
		}
	}
