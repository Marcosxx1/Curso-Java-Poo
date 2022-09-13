package entities;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Vetor {
	Scanner in = new Scanner(System.in).useLocale(Locale.US);

	private int[] arr;

	public Vetor(int[] arr) {
		super();
		this.arr = arr;
	}
 
	public Vetor() {
		
	}
	
	public Vetor(int size) {
		this.arr = new int[size];
	}
	
	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}



	 public void preenche() {
			int[] resultante = new int[arr.length];
			System.out.println("Digite os valores do vetor A");
			for (int i = 0; i < arr.length; i++) {
				resultante[i] = in.nextInt();
				this.arr[i] = resultante[i];
			}
			
	 }
	 
	public void mostra() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
