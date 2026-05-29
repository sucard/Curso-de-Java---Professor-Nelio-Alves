package somaDeNotas.entities;

public class Student {

	public String name;
	public double note1;
	public double note2;
	public double note3;
	
	public double FinalGrade() {
		
		return note1 + note2 + note3;
		
	}
	
	public String IsPassed() {
		
		if(FinalGrade() > 60) {
			
			return "PASS";
			
		}else {
			
			double remainder = 60.0 - FinalGrade(); 
			return "FAILED\n" + "MISSING " + String.format("%.2f", remainder) + " POINTS";
			
		}
		
	}
	
	public String toString() {
		
		return "FINAL GRADE = "
				+ String.format("%.2f%n", FinalGrade())
				+ IsPassed();
	}
	
}
