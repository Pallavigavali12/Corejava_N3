package org.tnsif.Array;
import java.util.Arrays;
import java.util.Scanner;
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int r;
		int c;
		System.out.println("Enter row anf col:");
		r=s.nextInt();
		c=s.nextInt();
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("enter value:");
				arr[i][j]=s.nextInt();
			}
			System.out.println();
		}
		
		for(int i=0;i<r;i++) {
			
			for(int j=0;j<c;j++) {
				System.out.print("arr["+i+"]["+j+"] = "+arr[i][j]+" ");
			}
			System.out.println();
			
		}
		

		for(int i=0;i<r;i++) {
			System.out.print("{");
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("}");
			
			
		}

	}

}
