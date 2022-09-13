package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Vetor;

public class Program {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in).useLocale(Locale.US);
		// Ainda não funcionando
		System.out.println("Quantos valores terão cada vetor?");
		int tam = in.nextInt();


		Vetor[] vetorClasse = new Vetor[3];


		for (int j = 0; j < 3; j++) {

			vetorClasse[j] = new Vetor(tam);
		}
		for (int i = 0; i < vetorClasse.length; i++) {
			vetorClasse[i].preencher();

		}

		int contador = 1;
		for (Vetor vetor2 : vetorClasse) {
			
			System.out.println(contador+" "+ vetor2);
			contador++;
		}

	}

}