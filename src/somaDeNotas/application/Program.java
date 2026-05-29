package somaDeNotas.application;
import java.util.Scanner;
import java.util.Locale;
import somaDeNotas.entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		Student student = new Student();
		
		System.out.println("Enter the requested data below: ");
		
		System.out.println("name: ");
		student.name = sc.nextLine();
		
		System.out.println("note 1: ");
		student.note1 = sc.nextDouble();
		
		System.out.println("note 2: ");
		student.note2 = sc.nextDouble();
		
		System.out.println("note 3: ");
		student.note3 = sc.nextDouble();
		
		System.out.println(student);
		
		sc.close();

	}

}
