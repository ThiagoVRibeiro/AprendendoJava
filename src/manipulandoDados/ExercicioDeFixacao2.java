package manipulandoDados;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDeFixacao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double raio;
		double area;
		double pi = 3.14159;
		
		System.out.println("Entre com valor do raio: ");
		raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2.00);
		System.out.println("O resultado da área é: " + area);
		
		sc.close();
	}

}
