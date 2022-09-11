package entities;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {
	Scanner in = new Scanner(System.in).useLocale(Locale.US);
	
	private double[] numero;
	private int tam;

	public Vetor() {
		
	}
	
	public Vetor(int tam) {
		numero =  new double[tam];
	}
 
	
	
	public double[] getNumero() {
		return numero;
	}



	public void setNumero(double[] numero) {
		this.numero = numero;
	}



	public int getTam() {
		return tam;
	}



	public void setTam(int tam) {
		this.tam = tam;
	}



	public void preencheVetor() {
		double recebe[] = new double[getNumero().length];
		
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Digite o "+(i+1)+" numero:");
			recebe[i] = in.nextDouble();
			setNumero(recebe);
		}
	}
	
	public void mostraNumeros () {
		
		for (int i = 0; i < numero.length; i++) {
			System.out.print(numero[i]+ " ");
		}
	}
	
	public double retornaSoma() {
		
		double soma = 0;
		for (int i = 0; i < numero.length; i++) {
			soma+=numero[i];

		}
		return soma;
	}
		
}




