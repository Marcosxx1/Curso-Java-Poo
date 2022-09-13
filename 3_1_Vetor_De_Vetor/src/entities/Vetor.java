package entities;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

 
public class Vetor {
	Scanner in = new Scanner(System.in).useLocale(Locale.US);

	public int[] vetor;
	
	public Vetor(int tam) {
		this.vetor = new int[tam];
	}
 
	public Vetor(int[] vetor) {
		
		this.vetor = vetor;
	}

	public int[] getVetor() {
		return vetor;
	}

	public void setVetor(int[] vetor) {
		this.vetor = vetor;
	}
	
	
	public void preencher() {
		
		
		for (int i = 0; i < vetor.length; i++) {
		vetor[i] = in.nextInt();
		}
	}
 
	@Override
	public String toString() {
		return  Arrays.toString(vetor);
	}
 
	
}