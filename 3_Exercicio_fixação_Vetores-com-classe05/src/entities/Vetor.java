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
	
	public void encontraMaior() {
		
 		int posicaoMaior = 0;
		int primeiro = arr[0];
		int segundo = arr[0];
		
		
		for (int i = 0; i < arr.length; i++) {
			if(primeiro > arr[i]) {
				primeiro = arr[i];
			} 
			if(segundo < arr[i]) {

				segundo = arr[i];
				posicaoMaior = i;

			}
		}
		System.out.println("MAIOR VALOR = "+ segundo);
		System.out.println("MENOR VALOR = "+ primeiro);
		System.out.println("\nPOSICAO DO MAIOR VALOR = "+ posicaoMaior);
	}
	
}
