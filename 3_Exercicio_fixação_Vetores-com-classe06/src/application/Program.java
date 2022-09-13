package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Vetor;

public class Program {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in).useLocale(Locale.US);
 
 		
		System.out.println("Quantos elementos terão cada vetor?");
		int tamanho = in.nextInt();

		int vetorUm[] = new int[tamanho];
		
		for (int i = 0; i < vetorUm.length; i++) {
			vetorUm[i] = in.nextInt();
		}
		
		int vetorDois[] = new int[tamanho];

		for (int i = 0; i < vetorDois.length; i++) {
			vetorDois[i] = in.nextInt();
		}
		
		int resultante[] = new int[tamanho];
		
		for (int i = 0; i < resultante.length; i++) {
			resultante[i] = vetorUm[i] + vetorDois[i];
		}
		
		for (int i = 0; i < resultante.length; i++) {
			System.out.print("["+resultante[i]+"] ");
		}
 
 
	}
 
}
