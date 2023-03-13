package org.tnsif.Array;
import java.util.Scanner;
public class JaggedAarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int arr[][]=new int[2][];
		arr[0]= new int[2];
		arr[1]= new int[3];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("enter no:");
				arr[i][j]=s.nextInt();
			}
			System.out.println();
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
