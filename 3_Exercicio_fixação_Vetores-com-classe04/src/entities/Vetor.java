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

 
	@Override
	public String toString() {
		return "Vetor [vetor = " + Arrays.toString(vetor) + "]";
	}
 
	
}
