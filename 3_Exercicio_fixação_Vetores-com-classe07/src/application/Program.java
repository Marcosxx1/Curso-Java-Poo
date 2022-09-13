package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Vetor;

public class Program {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Quantos elementos vai ter o vetor?");
		int size = in.nextInt();
		
		Vetor vetor = new Vetor(size);
		
		vetor.preencheVetor();
		double media = vetor.encontraMedia();
		
		System.out.println("MEDIA DO VETOR: "+media);
 
		
	}
}
