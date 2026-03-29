package estruturasRepetitivas;
import java.util.Scanner;
import java.util.Locale;

public class MediaPonderada {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		int quantidade = sc.nextInt();
		
		double media = 0.0;
		
		for (int i = 0; i < quantidade; i++) {
			
			double N1 = sc.nextDouble();
			double N2 = sc.nextDouble();
			double N3 = sc.nextDouble();
			
			media = ((N1 * 2) + (N2 * 3) + (N3 * 5)) / 10.0;
		
			System.out.printf("%.1f%n", media);
			
		}
		
		sc.close();
	}

}
