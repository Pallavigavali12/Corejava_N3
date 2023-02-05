package org.tnsif.DecisionMaking;
import java.util.Scanner;
public class CascadedIfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("enter value of n1:");
		n1=sc.nextInt();
		System.out.println("enter value of n2:");
		n2=sc.nextInt();
		System.out.println("enter value of n3:");
		n3=sc.nextInt();
		if(n1>n2 && n1>n3){
			System.out.println("greater no is:"+n1);
        }
		else if(n2>n1 && n2>n3){
			System.out.println("greater no is:"+n2);
		}
		else {
			System.out.println("greater no is:"+n3);
		}
		sc.close();
		

			

	}

}
