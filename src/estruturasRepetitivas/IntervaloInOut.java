package estruturasRepetitivas;
import java.util.Scanner;

public class IntervaloInOut {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int quantidadeDeValores = sc.nextInt();
		int valores = 0;
		int in = 0;
		int out = 0;
		
		for (int i = 0; i < quantidadeDeValores; i++) {
			
			valores = sc.nextInt();
			
			if (valores >= 10 && valores <= 20) {
				
				in++;
				
			}else {
				
				out++;
			}
			
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();

	}

}
