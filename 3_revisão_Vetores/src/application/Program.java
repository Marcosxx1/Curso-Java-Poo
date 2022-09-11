package application;

import java.util.Scanner;

import entities.Vetor;

public class Program {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Vetor vet = new Vetor( );
		
		System.out.println("Quantas pessoas?");
		int tam = in.nextInt();
		
		//para utilizar o .length, devemos passar o tamanho do vetor pelo construtor
		vet = new Vetor(tam);
 	 
 		double media = vet.preencheVetorSoma();
 
  		System.out.println("AVERAGE HEIGHT = " + media /tam);
	}
}
