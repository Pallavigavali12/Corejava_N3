package org.tnsif.exceptionhandling;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("First line:");
//		System.out.println("second line:");
//		try {
//			int arr[]=new int[] {1,2,3};
//			Print(arr);
//		}
//		catch(Exception e) {
//			System.out.println("the array doesnt have fourth element:");
//		}
//		System.out.println("third line");
//		public static void Print(int []arr) 
//		{
//			System.out.println(arr[3]);
//		}
		
		
		
		try {
			int arr[]= {12,45,678};
			System.out.println(arr[2]);
		}
		catch(Exception e) {
			System.out.println("exception is handled:"+e);
		}
		finally {
			System.out.println("finally block get executed");
		}

	}

}
