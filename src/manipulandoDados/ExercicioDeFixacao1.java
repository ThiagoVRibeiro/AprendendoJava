package manipulandoDados;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDeFixacao1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o primeiro valor: ");
		int a = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int b = sc.nextInt();
		int soma = a + b;
		System.out.println("Soma = " + soma);
		
		
		sc.close();
	}

}
