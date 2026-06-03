package cotacaoDolar.application;
import java.util.Scanner;
import java.util.Locale;
import cotacaoDolar.util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("What is the dollar price? ");
		
		double dollarPrice = sc.nextDouble();
		
		System.out.println();
		
		System.out.print("How many dollars will be bought? ");
		
		double value = sc.nextDouble();
		
		System.out.println();
		
		double amount = CurrencyConverter.convertion(value, dollarPrice);
		
		System.out.printf("Amount to be paid in reais: %.2f%n", amount);
		
		sc.close();

	}

}
