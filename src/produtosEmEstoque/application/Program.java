package produtosEmEstoque.application;
import java.util.Scanner;
import java.util.Locale;
import produtosEmEstoque.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		
		System.out.println("Name: ");
		product.name = sc.nextLine();
		
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		
		System.out.println("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println("product data:" + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be addded in stock: ");
		
		int update = sc.nextInt();
		product.AddProducts(update);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		
		update = sc.nextInt();
		product.RemoveProducts(update);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		sc.close();
		

	}

}
