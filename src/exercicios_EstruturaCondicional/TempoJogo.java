package exercicios_EstruturaCondicional;
import java.util.Scanner;

public class TempoJogo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int inicioJogo;
		int finalJogo;
		int tempoJogo;
		
		int tempoMaximo = 24;
		
		System.out.println("Qual horario iniciou o jogo?");
		inicioJogo = sc.nextInt();
		
		System.out.println("Qual horario finalizou o jogo?");
		finalJogo = sc.nextInt();
		
		if (finalJogo <= inicioJogo) {
			tempoJogo = (tempoMaximo - inicioJogo) + finalJogo;
			System.out.println("O JOGO DUROU " + tempoJogo + " HORA(S)");
		}
		else {
			tempoJogo = finalJogo - inicioJogo;
			System.out.println("O JOGO DUROU " + tempoJogo + " HORA(S)");
		}
		
		sc.close();
	}

}
