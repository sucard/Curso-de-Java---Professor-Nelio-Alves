package dadosDeFuncionario.application;
import java.util.Scanner;
import java.util.Locale;
import dadosDeFuncionario.entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Insert employee data: ");
		
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		
		System.out.println("Gross Salary: ");
		employee.GrossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee);
		
		System.out.println("Which percentage to incrase salary? ");
		double percentage = sc.nextDouble();
		
		employee.IncraseSalary(percentage);
		
		System.out.println("Update data: " + employee);	
		
		sc.close();
		
	}

}
