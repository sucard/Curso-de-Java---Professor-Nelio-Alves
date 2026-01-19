package estruturasRepetitivas;
import java.util.Scanner;

public class SenhaDeAcesso {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int senhaDeAcesso = 2002;
		
		int entradaDoUsuario = sc.nextInt();
		
		while(entradaDoUsuario != senhaDeAcesso) {
			System.out.println("Senha invalida");
			entradaDoUsuario = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();

	}

}
