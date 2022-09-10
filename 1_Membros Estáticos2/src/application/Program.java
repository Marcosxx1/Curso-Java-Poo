package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		/*Quando os métodos são estáticos, não é necessário instanciar
		 * o objeto. Só chamar pelo nome e atributos*/
		
		System.out.println("Enter radius: ");
		double radius = in.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.println(String.format("Circumference: %.2f", c));
		System.out.println(String.format("Volume: %.2f", v));
		System.out.println(String.format("PI value: %.2f", Calculator.PI));
		
		
		
	}


}















