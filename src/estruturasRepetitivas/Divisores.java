package estruturasRepetitivas;
import java.util.Scanner;

public class Divisores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int valor = sc.nextInt();
		
		for(int i = 1; i <= valor; i++) {
			
			if(valor % i == 0) {
				System.out.println(i);
			}
			
		}
		
		sc.close();
		

	}

}
