package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		//Como os métodos de Calculator não são estáticos, devemos
		//instanciar o objeto.
		
		Calculator cal = new Calculator();
		
		System.out.println("Enter radius: ");
		double radius = in.nextDouble();
		
		double c = cal.circumference(radius);
		
		double v = cal.volume(radius);
		
		System.out.println(String.format("Circumference: %.2f", c));
		System.out.println(String.format("Volume: %.2f", v));
		System.out.println(String.format("PI value: %.2f", cal.PI));
		
		
		
	}


}















