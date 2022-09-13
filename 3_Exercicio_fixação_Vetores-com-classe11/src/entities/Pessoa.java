package entities;

import java.util.Arrays;

public class Pessoa {
	
	private String nome;
	private double[] notas = new double[2];
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, double[] notas) {
		super();
		this.nome = nome;
		this.notas = notas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return nome;
	}
 
	public double media() {
		double mediaBim = 0;
		for (int i = 0; i < notas.length; i++) {
			mediaBim += notas[i] ;
		}
		
		return mediaBim / notas.length;
	}
	
}
