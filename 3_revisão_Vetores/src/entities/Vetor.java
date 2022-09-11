package entities;

import java.util.Scanner;

public class Vetor {
	Scanner in = new Scanner(System.in);

	private int tam;
	private double[] vetor;
	public double media;
	
	
	public Vetor(int tam) {
		this.tam = tam;
		vetor = new double[tam];
	}
	
	public Vetor( ) {
 	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public double[] getVetor() {
		return this.vetor;
	}

	public void setVetor(double[] vetor) {
		this.vetor = vetor;
	}
	
	public void setMedia(double media) {
		this.media = media;
		}
	
	
	
	public double preencheVetorSoma() {
		double[] valores = new double[tam];
		
 
		
		 	for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite a "+(i+1)+" altura: ");
		    valores[i] = in.nextDouble();
		    this.media +=  valores[i];
		    
			setVetor(valores);
 		}	
		
		return media;
	}
	
 
}








