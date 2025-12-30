package exercicios_EstruturaCondicional;
import java.util.Scanner;

public class ValoresMultiplos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int A;
		int B;
		
		System.out.println("Digite um número");
		A = sc.nextInt();
		
		System.out.println("Digite outro número");
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Os números digitados são multiplos");
		}
		else {
			System.out.println("Os números digitados não são multiplos");
		}
		
		sc.close();

	}

}
