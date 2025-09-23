package exercicio05;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int codigoPeca, codigoPeca2, quantidadePeca, quantidadePeca2;
		double valorUnitario, valorUnitario2, valorTotal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código da peça: ");
		codigoPeca = sc.nextInt();

		System.out.println("Digite a quantidade desejada: ");
		quantidadePeca = sc.nextInt();
		
		System.out.println("Digite o custo unitário: ");
		valorUnitario = sc.nextDouble();

		System.out.println("Digite o código da peça: ");
		codigoPeca2 = sc.nextInt();

		System.out.println("Digite a quantidade desejada: ");
		quantidadePeca2 = sc.nextInt();
		
		System.out.println("Digite o custo unitário: ");
		valorUnitario2 = sc.nextDouble();
		
		sc.close();
		
		valorTotal = quantidadePeca * valorUnitario + quantidadePeca2 * valorUnitario2;
		
		System.out.printf("Produtos selecionados: %d e %d%n", codigoPeca, codigoPeca2);
		System.out.printf("O valor total a ser pago é de R$ %.2f%n", valorTotal);

	}

}
