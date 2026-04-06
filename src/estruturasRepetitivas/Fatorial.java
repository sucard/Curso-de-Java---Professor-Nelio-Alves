package estruturasRepetitivas;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int valor =  sc.nextInt();
		
		int resultado = 1;
		
		for(int i = valor; i > 0; i--) {
			
			resultado *= i;
			
		}
		
		System.out.println(resultado);
		
		sc.close();

	}

}
