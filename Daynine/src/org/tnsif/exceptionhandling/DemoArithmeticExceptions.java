package org.tnsif.exceptionhandling;
import java.util.Scanner;

public class DemoArithmeticExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x;
		int y;
		System.out.println("enter value of x and y:");
		x=s.nextInt();
		y=s.nextInt();
		try {
			int result=x/y;
			System.out.println("result:"+result);
		}
		catch(Exception e){
			System.out.println("Exception is handled by using catch:"+e);
		}
		finally {
			System.out.println("exception is handled successfully!");
		}

	}

}
