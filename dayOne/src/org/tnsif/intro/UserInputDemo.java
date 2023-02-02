package org.tnsif.intro;
//import Scanner class to take user input 
import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter int value:");
		int x=sc.nextInt();
		System.out.println("int input:"+x);
		
		System.out.println("enter float value:");
		float y=sc.nextFloat();
		System.out.println("float input:"+y);
		
		System.out.println("enter double value:");
		double z=sc.nextDouble();
		System.out.println("Double input:"+z);
		
		System.out.println("enter String value:");
		String name=sc.next();
		System.out.println("string input:"+name);
		
		sc.nextLine();
		
		System.out.println("enter String value:");
		String name2=sc.nextLine();
		System.out.println("String input:"+name2);
		
		System.out.println("enter character value:");
		char ch=sc.next().charAt(0);
		System.out.println("character input:"+ch);
		
		sc.close();
		

	}

}
