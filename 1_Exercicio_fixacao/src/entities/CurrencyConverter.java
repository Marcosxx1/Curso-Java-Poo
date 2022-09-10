package entities;

public class CurrencyConverter {
	
	public double dolar;
	public int quantity;
 
	
	public double calc(double dolar, int quantity) {
		double total = dolar * quantity;
		double IOF = total * 0.06;
		return  total + IOF;
	}
}
