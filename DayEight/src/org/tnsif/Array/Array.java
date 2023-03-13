package org.tnsif.Array;
// using user input printing array
import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		how to declare array
		int b[]= {87,10,30,80};
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("enter n:");
		n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter no:");
			int n1=s.nextInt();
			arr[i]=n1;
		}
		System.out.println("array");
		for(int a:arr) {		
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("sorted order");
//		how to sort array 
		Arrays.sort(b);
		for(int j:b) {
			System.out.println(j);
		}
		s.close();
		

	}

}
