package exercicio_ValorDoRaio;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double raio, pi, area, raioQuadrado;
		
		pi = 3.14159;
		
		System.out.println("Digite o valor do raio: ");
		
		Scanner sc = new Scanner(System.in);
		
		raio = sc.nextDouble();
		
		sc.close();
		
		raioQuadrado = Math.pow(raio, 2.0);
		
		area = pi * raioQuadrado;
		
		System.out.printf("O valor do raio é de %.4f%n", area);

	}

}
