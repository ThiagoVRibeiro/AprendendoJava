package manipulandoDados;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		//Quebra de linha pendente: deve-se atentar quando usar um next int ou outro antes do nextline
		//ele não pula linha automativante, para isso deve-se inserir um sc.nextLine() antes de continuar
		
		
		//Ler String
		String x ; 
		x = sc.next();
		System.out.println("Dado digitado: "+ x);

		//Ler inteiro
		int y ; 
		y = sc.nextInt();
		System.out.println("Dado digitado: "+ y);
		
		//Ler ponto flutuante
		Double z ; 
		z = sc.nextDouble();
		System.out.printf("Dado digitado: "+ z);
		
		//Ler caractere
		char k;
		k = sc.next().charAt(0);
		System.out.println("Dado digitado: " + k);
		
		sc.close();
	}

}
