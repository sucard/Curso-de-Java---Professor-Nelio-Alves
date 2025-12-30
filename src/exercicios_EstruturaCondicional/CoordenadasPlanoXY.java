package exercicios_EstruturaCondicional;
import java.util.Scanner;
import java.util.Locale;

public class CoordenadasPlanoXY {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		double X;
		double Y;
		
		System.out.println("Insira um valor para X: ");
		X = sc.nextDouble();
		
		System.out.println("Insira um valor para Y: ");
		Y = sc.nextDouble();
		
		if (X == 0 && Y == 0) {
			System.out.println("Origem");
		}
		else if (X == 0 ) {
			System.out.println("Eixo Y");
		}
		else if (Y == 0) {
			System.out.println("Eixo X");
		}
		else if (X > 0 && Y > 0) {
			System.out.println("Q1");
		}
		else if (X < 0 && Y > 0) {
			System.out.println("Q2");
		}
		else if (X < 0 && Y < 0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		
		sc.close();

	}

}
