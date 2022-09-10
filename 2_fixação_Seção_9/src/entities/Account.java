package entities;

public class Account {
	
	private int accountNumber;
	private String nomeTitular;
	private double valorAtual;
	
	public Account() { 
		
	} 
	
	public Account(int accontNumber, String nomeTitular, double valorAtual) {
		this.accountNumber = accontNumber;
		this.nomeTitular = nomeTitular;
		Deposit(valorAtual);
	}
	
	public Account(int accontNumber, String nomeTitular  ) {
		this.accountNumber = accontNumber;
		this.nomeTitular = nomeTitular; 
	}
	
	public int getAccountNumner() {
		return accountNumber;
	}
 
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public double getValorAtual() {
		return valorAtual;
	}
	
 
	public void Deposit(double valor) {
		this.valorAtual += valor;
	}
	
	public void Withdraw(double valor) {
		this.valorAtual -= valor+5 ;
	}
 
	public String toString() {

		return  
			   "Account "+getAccountNumner()+
			   ", Holder: "+getNomeTitular()+
			   String.format(", Balance: $ %.2f",+getValorAtual());
 
	}
	

	
}











