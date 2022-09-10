package entities;


/*private: o membro só pode ser acessado na própria classe (precisamos dos get/set para acessa-los)
* protected: o membro só pode ser acessado nas classes do MESMO PACOTE, com como em subclasses de pacotes diferentes
* public: o membro é acessado por todas as classes (a não ser que ele resida em um módulo diferente, que não exporte o pacote onde ele esta)
* (nada): o membro só pode ser acessado nas classes do mesmo pacote
* */
public class Product {
    String name;
	private double price;
	private int quantity;

	public Product(String name, double price, int quantity) { /*Construtor pegando todos atributos da classe*/
		this.name = name;			
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price ) { /*2*/
		this.name = name;
		this.price = price;
	}
 
	public Product() { /*padrão*/
		
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}