package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Quantos alunos serão digitados?");
		int quantidade = in.nextInt();
		Pessoa[] pessoa = new Pessoa[quantidade];
		
		
		
		for (int i = 0; i < pessoa.length; i++) {
			double notaTemp[] = new double[2];
			
			System.out.println("Digite o nome, primeira e segunda nota do "+(i+1)+"o aluno:");
			String nome= in.next ();
		
			in.nextLine();
			notaTemp[0] = in.nextDouble();
			notaTemp[1] = in.nextDouble();
			

			pessoa[i] = new Pessoa(nome, notaTemp );
		}
					System.out.println("Alunos aprovados: ");

		for (int i = 0; i < pessoa.length; i++) {
			double media = pessoa[i].media();
			if(media>= 6) {
				System.out.println(pessoa[i]);
			}
		}
		
	}
}
