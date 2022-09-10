package entities;

public class Employee {

	public String name;
	public double GrossSalary;
	public double Tax;

	public double netSalary() {
		return this.GrossSalary - Tax;
		}

	public void IncreaseSalary(double percentage) {

		percentage /= 100;

		this.GrossSalary = this.GrossSalary + ( this.GrossSalary * percentage);
	}
	
	public String toString() {
		
		return "Employee: "+name+", $ "+netSalary();
	}
}
