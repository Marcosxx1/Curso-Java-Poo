package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Employee em = new Employee();
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Name: ");
		em.name = in.nextLine();
		
 		System.out.println("Gross salary: ");
		em.GrossSalary = in.nextDouble();
		
		System.out.println("Tax: ");
		em.Tax = in.nextDouble();
		
 
		System.out.println(em);
		System.out.println();
		
		System.out.println("Which percentage to increase salary?");
		double pctgm = in.nextDouble();
		em.IncreaseSalary(pctgm);
		
		
		System.out.println("Updated data: "+em);
 
	}
}











