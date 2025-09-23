package exercicio01;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int primeiroValor, segundoValor, resultado;

		System.out.println("Digite um número inteiro:");
		primeiroValor = sc.nextInt();

		System.out.println("Digite mais um número inteiro: ");
		segundoValor = sc.nextInt();

		sc.close();

		resultado = primeiroValor + segundoValor;

		System.out.println("A soma dos valores digitados é de = " + resultado);

	}

}
