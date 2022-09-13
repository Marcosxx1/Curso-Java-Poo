package entities;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

 
public class Vetor {
	Scanner in = new Scanner(System.in).useLocale(Locale.US);

	private int[] arr;
	
  
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
	
	public void preenche(int size) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Digite o "+(i+1)+" elemento: ");
			arr[i] = in.nextInt();
		}
	}
	
	public void encontraPar() {
		int count = 0;
		int media = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				
				media +=arr[i];
				count ++;
			}
		}
		
		if(count > 0) {
			System.out.println("\nMEDIA DOS PARES = "+ media /count);

		} else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
	}
	
}
