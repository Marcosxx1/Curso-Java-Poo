package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Exercicio01 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter width:  ");
		rectangle.Width = in.nextDouble();
		
		
		System.out.println("Enter height");
		rectangle.Height = in.nextDouble();
		
		
		System.out.println(rectangle);
		
	}
}
