package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Vetor;

public class Program {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in).useLocale(Locale.US);
		//Ainda não funcionando
		System.out.println("Quantos valores terão cada vetor?");
		int tam = in.nextInt();
		Vetor vetor = new Vetor(tam);
		
 
		Vetor[] vetorClasse = new Vetor[3];
 
		int[] a = new int[3];
		
 		for (int j = 0; j < 3; j++) {
				a[j] = in.nextInt();
				vetorClasse[j] = new Vetor(a);
			}
		for (int i = 0; i <3; i++) {
	
		}
		
		for(Vetor vetor2 : vetorClasse) {
			System.out.println(vetor2);
		}
		
	}
	
}
 