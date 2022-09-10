package entities;

public class Student {

	public double grade[] = new double[3];
	public String name;

	public double Grade() {
		double sum = 0;
		
		for (int i = 0; i < grade.length; i++) {
			sum += grade[i];
		}
		return sum;
	}
	
 
}
