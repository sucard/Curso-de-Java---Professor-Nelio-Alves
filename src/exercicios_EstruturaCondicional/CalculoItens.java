package exercicios_EstruturaCondicional;
import java.util.Scanner;
import java.util.Locale;

public class CalculoItens {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		
		String item = "";
		double preco = 0.0;
		int quantidade;
		
		System.out.println("Selecione o item desejado:");
		System.out.println("1 - Cachorro Quente");
		System.out.println("2 - X-Salada");
		System.out.println("3 - X-Bacon");
		System.out.println("4 - Torrada Simples");
		System.out.println("5 - Refrigerante");
		int codigo = sc.nextInt();
		
		System.out.println("Selecione a quantidade desejada:");
		quantidade = sc.nextInt();
		
		
		if (codigo == 1) {
			item = "Cachorro Quente";
			preco = 4.00;
		}
		else if (codigo == 2) {
			item = "X-Salada";
			preco = 4.50;
		}
		else if (codigo == 3) {
			item = "X-Bacon";
			preco = 5.00;
		}
		else if (codigo == 4) {
			item = "Torrada Simples";
			preco = 2.00; 
		}
		else if (codigo == 5) {
			item = "Refrigerante";
			preco = 1.50;
		}
		else {
			System.out.println("Código invalido!");
		}
				
		double calculo = preco * quantidade;
		
		System.out.println("Código selecionado: " + codigo);
		System.out.println("Item Selecionado: " + item);
		System.out.printf("Valor Total: R$ %.2f%n ",  calculo);

		sc.close();
		
	}

}
