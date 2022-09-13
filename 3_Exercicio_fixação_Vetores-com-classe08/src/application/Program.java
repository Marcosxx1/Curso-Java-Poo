package application;

import java.util.Locale;

import java.util.Scanner;

import entities.Vetor;

public class Program {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in).useLocale(Locale.US);
		
		
		System.out.println("Quantos números você vai digitar?");
		int tamanho = in.nextInt();
		Vetor vetor = new Vetor(tamanho);

		vetor.preenche(tamanho);
		
		vetor.encontraPar();
		
	}
	
}
 