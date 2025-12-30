package exercicios_EstruturaCondicional;
import java.util.Scanner;

public class NumeroParImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Digite um número");
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Esse é um número Par");
		}
		else {
			System.out.println("Esse é um número impar");
		}
		
		sc.close();

	}

}
