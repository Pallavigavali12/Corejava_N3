package org.tnsif.looping;
// example on for loop
import java.util.Scanner;
public class forDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter value of n:");
		n=sc.nextInt();
//		to print 1 to n numbers
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=n;i>0;i--) {
			System.out.print(i+" ");
		}



	}

}
