package entities;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {
	Scanner in = new Scanner(System.in).useLocale(Locale.US);

	 private double[] arr;
	 
	 public Vetor() {
		 
	 }
	 
	 public Vetor(int size) {
		 this.arr = new double[size];
	 }

	public double[] getArr() {
		return arr;
	}

	public void setArr(double[] arr) {
		this.arr = arr;
	}

	 
	
	public void preencheVetor() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Digite o "+(i+1)+" elemento: ");
			arr[i] = in.nextDouble();
		}
	}
	
	public double encontraMedia() {
		double media = 0;
		
		for (int i = 0; i < arr.length; i++) {
		media += arr[i] / (arr.length);	
		}
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < media) {
				System.out.println(arr[i]);
			}
		}
		return media ;
	}
}








