package application;

import java.util.Scanner;

import entities.Student;

public class Program {
 public static void main(String[] args) {
	 
	 Scanner in = new Scanner(System.in);
	 
	 System.out.println("Name:");
	 Student stdnt = new Student();
	 
	 stdnt.name = in.nextLine();
	 
	 for (int i = 0; i < stdnt.grade.length; i++) {
		System.out.println("Insert the "+(i+1)+" grade");
		stdnt.grade[i] = in.nextDouble();
	}
	 
	 if(stdnt.Grade() > 60) {
		 System.out.println("FINAL GRADE = "+stdnt.Grade());
		 System.out.println("PASS");
	 }else {
		 System.out.println("FINAL GRADE = "+stdnt.Grade());
		 System.out.println("FAILED");
		 System.out.println("MISSING "+(60 - stdnt.Grade())+" POINTS");

	 }
	 
 }
}
