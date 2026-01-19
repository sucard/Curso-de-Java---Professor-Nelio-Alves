package estruturasRepetitivas;
import java.util.Scanner;

public class PostoDeCombustivel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int codigo = sc.nextInt();
		
		while(codigo != 4) {
			
			if(codigo == 1) {
				System.out.println("Álcool: 1");
			}
			if(codigo == 2) {
				System.out.println("Gasolina: 2");
			}
			if(codigo == 3) {
				System.out.println("Diesel: 3");
			}
			
			codigo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO!");
		
		sc.close();

	}

}
