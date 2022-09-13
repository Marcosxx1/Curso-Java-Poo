package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Quantas pessoas você vai digitar?");
		int quantidade = in.nextInt();
		
		Pessoa[] pessoa = new Pessoa[quantidade];
		
		for (int i = 0; i < pessoa.length; i++) {
			System.out.println("Dados da "+(i+1)+"ª pessoa: ");

			//in.next();

			
			in.nextLine();
			System.out.println("Nome: ");
			String nome = in.nextLine();
 
			//in.nextLine();
			System.out.println("Idade: ");
			int idade = in.nextInt();
			
			pessoa[i] = new Pessoa(nome, idade);
		}
		
		
		int maior = pessoa[0].getAge();
		for (int i = 0; i < pessoa.length; i++) {
			if(pessoa[i].getAge() > maior) {
				maior = pessoa[i].getAge();
			}
		}
		
		for (Pessoa pessoa2 : pessoa) {
			if(pessoa2.getAge() == maior) {
				System.out.println("Pessoa mais velha: "+ pessoa2.getName());
			}
		}
 
	}
}
