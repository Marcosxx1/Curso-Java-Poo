package application;

import java.util.Locale;
import java.util.Scanner;
 
public class Program {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Quantas pessoas serão digitadas?");
		int n = in.nextInt();
		
		vetorPessoa[] vetPes = new vetorPessoa[n]; 
		
		for (int i = 0; i < vetPes.length; i++) {
			System.out.println("Dados da "+(1+i)+" pessoa");
			
			System.out.println("Nome: ");
			String nome = in.nextLine();
			
			in.nextLine();
			System.out.println("Idade: ");
			int idade = in.nextInt();
			
			System.out.println("Altura: ");
			double altura = in.nextDouble();
			
			//objeto na posição 'i' recebe os dados
			vetPes[i] = new vetorPessoa(nome, idade, altura);
		}
		
		double somaAltura = 0;
		for (int i = 0; i < vetPes.length; i++) {
			somaAltura += vetPes[i].getAltura();
		}
		
		double porcentagem = 0;
		double contador = 0;
		
 		for (int i = 0; i < vetPes.length; i++) {
			if(vetPes[i].getIdade() < 16) {
				contador ++;
				}		

		}
		porcentagem += 100.0 / (n / contador);

 		//total = n /100 * contador < 16
		System.out.println(n);
		System.out.println(contador);
		
		System.out.println("Altura média: "+ somaAltura /vetPes.length);
		System.out.println("Pessoas com menos de 16 anos: %.2f" +porcentagem+"%");
		
		
		for (int i = 0; i < vetPes.length; i++) {
			if(vetPes[i].getIdade() < 16) {
				System.out.println(vetPes[i].getNome());
			}
		}
	}
	
	
}
