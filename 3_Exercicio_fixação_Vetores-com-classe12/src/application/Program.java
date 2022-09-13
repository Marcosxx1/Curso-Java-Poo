package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Quantas pessoas serão digitadas?");
		int tamanho = in.nextInt();

		Pessoa[] pessoa = new Pessoa[tamanho];

		double maior = 0.0;
		double menor = 0.0;
		for (int i = 0; i < pessoa.length; i++) {
			System.out.println("Altura da " + (i + 1) + " pessoa");
			double altura = in.nextDouble();

			System.out.println("Genero da " + (i + 1) + "a pessoa");
			char genero = in.next().charAt(0);

			pessoa[i] = new Pessoa(altura, genero);
			menor = altura;
			maior = altura;
		}

		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getAltura() > maior) {
				maior = pessoa[i].getAltura();
			} else if (pessoa[i].getAltura() < menor) {
				menor = pessoa[i].getAltura();
			}
		}

		double media = 0.0;
		double contadorAlturaMulheres = 0;
		int contadorQtdHomens = 0;
		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getGenero() == 'F') {
				media += pessoa[i].getAltura();
				contadorAlturaMulheres++;

			}
			if (pessoa[i].getGenero() == 'M') {
				contadorQtdHomens++;
			}
		}

		System.out.println("Menor altura = " + menor);
		System.out.println("Maior altura = " + maior);
		System.out.printf("Media das alturas das mulheres = %.2f%n", media / contadorAlturaMulheres);
		System.out.println("Numero de homens = " + contadorQtdHomens);

	}
}
