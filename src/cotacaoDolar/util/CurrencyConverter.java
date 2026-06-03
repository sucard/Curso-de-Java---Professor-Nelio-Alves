package cotacaoDolar.util;

public class CurrencyConverter {
	
	public static double convertion(double value, double dollarPrice) {
		
		double total = dollarPrice * value;
		double iof = total * 0.06;
		
		return total + iof;
		
	}
	

}
