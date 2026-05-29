package dadosDeFuncionario.entities;

public class Employee {

	public String name;
	public double GrossSalary;
	public double tax;
	
	public double netSalary() {
		
		return GrossSalary - tax;
		
	}
	
	public void IncraseSalary(double percentage) {
		
		this.GrossSalary += GrossSalary * (percentage / 100.0);
		
	}
	
	public String toString() {
		
		return name
				+ ", $ "
				+ String.format("%.2f", netSalary());
		
	}
}
