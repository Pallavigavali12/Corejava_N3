package org.tnsif.DecisionMaking;
import java.util.Scanner;
public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a operator:");
		char operator=s.next().charAt(0);
		int a,b;
		switch(operator) {
		case '+':
		{
			System.out.println("enter value of a and b:");
			a=s.nextInt();
			b=s.nextInt();
			System.out.println("addition of a and b is:"+(a+b));
			break;
		}
		case '-':
		{
			System.out.println("enter value of a and b:");
			a=s.nextInt();
			b=s.nextInt();
			System.out.println("substraction of a and b is:"+(a-b));
			break;
		}
		case '*':
		{
			System.out.println("enter value of a and b:");
			a=s.nextInt();
			b=s.nextInt();
			System.out.println("multiplication of a and b is:"+(a*b));
			break;
		}
		case '/':
		{
			System.out.println("enter value of a and b:");
			a=s.nextInt();
			b=s.nextInt();
			System.out.println("division of a and b is:"+(a/b));
			break;
		}
		default:
		{
			System.out.println("invalid operator!!");
		}
		}
		s.close();

	}

}
