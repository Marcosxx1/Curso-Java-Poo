package application;

public class vetorPessoa {

	private String nome;
	private int idade;
	private double altura;
	
	public vetorPessoa() {
		
	}
	
	public vetorPessoa(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdada(int idade) {
		this.idade = idade;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
}
