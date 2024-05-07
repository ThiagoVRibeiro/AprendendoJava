package manipulandoDados;

import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {
		
		//Saída de dados
		System.out.println("Projeto para revisar conceitos de Java!");
		
		//Declarar variável
		int y = 10;
		System.out.println(y);
		System.out.println("O valor de y é: " + y);

		//Variável com ponto flutuante
		double x = 10.35353535;
		System.out.println(x);
		System.out.printf("Controlando a quantidade de casas decimais %.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("Controlando a quantidade de casas decimais %.4f%n", x);
		System.out.printf("Controlando a quantidade de casas decimais %.2f, utilizado duas casas.%n", x);

		//Saída com print F (f ponto flutuante, d para inteiro, s para texto e n para quebra de linha)
		String nome = "Thiago";
		int idade = 33;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e recebe R$ %.2f reais %n", nome, idade, renda);
		
		//Casting - Conversão explícita de valores
		int j;
		int k;
		double resultado;
		j = 5;
		k = 2;
		resultado = j / k;
		System.out.println("Resultado sem casting: " + resultado);
		resultado = (double)j / k;
		System.out.println("Resultado com casting: " + resultado);
		
	}

}
