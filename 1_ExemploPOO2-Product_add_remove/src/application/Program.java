package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		 
		Locale .setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		
		Product product = new Product();
		
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = in.nextLine();
		
		System.out.println("Price");
		product.price = in.nextDouble();
		
		System.out.println("Quantity in stock: ");
		product.quantity = in.nextInt();
		
		System.out.println(product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = in.nextInt();
		product.AddProducts(quantity);
		
		System.out.println();
		System.out.println(product);

		
		System.out.println("Enter the number of products to be removed in stock: ");
		 quantity = in.nextInt();
		product.RemoveProducts(quantity);
		
		System.out.println();
		System.out.println(product);
		//System.out.println(product.name +", "+ product.price+", "+ product.quantity);
		
	}

}
