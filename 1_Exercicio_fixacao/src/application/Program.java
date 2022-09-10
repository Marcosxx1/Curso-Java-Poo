package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		CurrencyConverter CC = new CurrencyConverter();
		
		
		System.out.println("What is the dollar price?");
		CC.dolar = in.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		CC.quantity = in.nextInt();
		
		System.out.println("Amlunt to be paid in reais = "+CC.calc(CC.dolar, CC.quantity));
		
	}

}
