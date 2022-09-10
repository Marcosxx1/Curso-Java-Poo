package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		Account ac ;

		System.out.println("Enter account number: ");
		int accountNumber = in.nextInt();
	    // ac.setAccountNumner(accountNumber);

		in.nextLine();
		System.out.println("Enter account holder: ");
		String nomeTitular = in.nextLine();
		//ac.setNomeTitular(nomeTitular);

		double deposit = 0;
		System.out.println("Is there a initial deposit? (y/n)?");
		char c = in.next().charAt(0);
		if (c == 'y') {
			System.out.println("Enter initial deposit: ");
			deposit = in.nextDouble();
			//// ac.setValorAtual(deposit);
		} else if (c == 'n') {
			// ac.setValorAtual(0.0);
		}
		ac = new Account(accountNumber, nomeTitular, deposit);

		System.out.println(ac);
		System.out.println();

		System.out.println("Enter a deposit value: ");
		deposit = in.nextDouble();
		ac.Deposit(deposit);
		System.out.println("Updated account data: " + ac.toString());

		System.out.println("Enter a withdraw value: ");
		double withdraw = in.nextDouble();
		ac.Withdraw(withdraw);
		System.out.println("Updated account data: " + ac.toString());

	}
}
