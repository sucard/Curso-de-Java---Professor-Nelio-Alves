package sistemaBancario;
import java.util.Scanner;
import java.util.Locale;
import sistemaBancario.entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double amount;
		
		Client client;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String accountHolderName = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.println("Enter initial deposit value: ");
			amount = sc.nextDouble();
			client = new Client (accountNumber, accountHolderName, amount);
		} else {
			client = new Client (accountNumber, accountHolderName);
		}
		
		System.out.println();
		
		System.out.println("Account data:");
		System.out.println(client);
		
		System.out.println();
		
		System.out.println("Enter a deposit value: ");
		amount = sc.nextDouble();
		client.bankDeposit(amount);
		
		System.out.println();
		
		System.out.println("Updated account data: ");
		System.out.println(client);
		
		System.out.println();
		
		System.out.println("Enter a withdraw value: ");
		amount = sc.nextDouble();
		client.withdrawal(amount);
		
		System.out.println();
		
		System.out.println("Updated account data: ");
		System.out.println(client);
		
		sc.close();
		
	}

}
