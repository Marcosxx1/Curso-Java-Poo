package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in).useLocale(Locale.US);
		Locale.setDefault(Locale.US);
		
		System.out.println("Quantos: ");
		int n = in.nextInt();
		
		Product[] product = new Product[n];
		
		for (int i = 0; i < product.length; i++) { 
			in.nextLine();//Consumindo o a quebra de linha do int n;
			
			System.out.println("Name: ");
			String name = in.nextLine();
			
			System.out.println("Price: ");
			double price = in.nextDouble();
			
			product[i] = new Product(name, price);
		}
		
		double soma = 0;
		
		for (int i = 0; i < product.length; i++) {
			soma +=product[i].getPrice();
		}
		
		double media = soma / product.length;
		
		System.out.printf("Media dos preços: %.2f", media);
	}

}
