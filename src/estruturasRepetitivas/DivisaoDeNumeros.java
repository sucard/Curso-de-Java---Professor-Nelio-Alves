package estruturasRepetitivas;
import java.util.Scanner;
import java.util.Locale;

public class DivisaoDeNumeros {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		int quantidade = sc.nextInt();
		
		for (int i = 0; i < quantidade; i++) {
			
			double valor1 = sc.nextInt();
			double valor2 = sc.nextInt();
			
			double formula = valor1 / valor2;
			
			if(valor2 == 0) {
				System.out.println("Divisão impossivel");
			}else {
				System.out.printf("%.1f%n", formula);
			}
			
		}

		sc.close();
		
	}

}
