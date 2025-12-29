package exercicio_Areas;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

		double pi = 3.14159;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		A = sc.nextDouble();

		System.out.println("Digite um valor: ");
		B = sc.nextDouble();

		System.out.println("Digite um valor: ");
		C = sc.nextDouble();

		sc.close();

		triangulo = A * C / 2;

		circulo = pi * Math.pow(C, 2);

		trapezio = (A + B) * C / 2;

		quadrado = B * B;

		retangulo = A * B;

		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);

	}

}
