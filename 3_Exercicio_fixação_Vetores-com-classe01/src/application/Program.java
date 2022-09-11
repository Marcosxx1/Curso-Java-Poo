package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Vetor;

public class Program {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Quantos números você vai digitar?");
		int n = in.nextInt();
		while(n > 10) {
			System.out.println("MÁXIMO 10 NUMEROS!");
		}
		
		//Vetor[] vetor = new Vetor[n]; Aqui estamos criando ponteiros de 
									//referencia para vários vetores, esta certo mas não para esse exercício

		Vetor vetor = new Vetor(n);
		vetor.preencheVetor();
		vetor.encontraNegativos();
	}
}
