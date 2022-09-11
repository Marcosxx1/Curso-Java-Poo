package entities;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {
	Scanner in = new Scanner(System.in).useLocale(Locale.US);
	
	private int[] numero;
	private int tam;

	public Vetor() {
		
	}
	
	public Vetor(int tam) {
		numero = new int[tam];
	}
	
	public int[] getNumero() {
		return this.numero;
	}
	
	public void setNumero(int[] numero) {
		this.numero = numero;
	}
	
	public int getTam() {
		return tam;
	}
	
	public void setTam(int tam) {
		this.tam = tam;
	}
	
	public void preencheVetor() {
		int recebe[] = new int[getNumero().length];
		
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Digite o "+(i+1)+" numero:");
			recebe[i] = in.nextInt();
			setNumero(recebe);
		}
	}
	
	public void encontraNegativos() {
		
		System.out.println("NUMEROS NEGATIVOS: ");
		for (int i = 0; i < numero.length; i++) {
			if(numero[i] < 0) {
				System.out.println(numero[i]);
			}
			
		}
	}
	
	
}




