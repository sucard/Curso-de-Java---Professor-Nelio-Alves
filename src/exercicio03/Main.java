package exercicio03;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int primeiroValor, segundoValor, terceiroValor, quartoValor, diferenca;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		primeiroValor = sc.nextInt();
		
		System.out.println("Digite outro valor: ");
		segundoValor = sc.nextInt();
		
		System.out.println("Digite outro valor: ");
		terceiroValor = sc.nextInt();
		
		System.out.println("Digite o ultimo valor: ");
		quartoValor = sc.nextInt();
		
		sc.close();
		
		diferenca =  primeiroValor * segundoValor - terceiroValor * quartoValor;
		
		System.out.println("A diferença entre os valores apresentados é de = " + diferenca);

	}

}
