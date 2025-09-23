package exercicio04;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int id;
		double horasTrabalhadas, valorHora, salario;

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o ID do funcionario: ");
		id = sc.nextInt();

		System.out.println("Informe a quantidade de horas trabalhadas: ");
		horasTrabalhadas = sc.nextDouble();

		System.out.println("Informe o valor hora por contrato: ");
		valorHora = sc.nextDouble();

		sc.close();

		salario = horasTrabalhadas * valorHora;

		System.out.printf("Resultado: %n");
		System.out.printf("ID = %d %n", id);
		System.out.printf("Salário = U$ %.2f%n", salario);

	}

}
