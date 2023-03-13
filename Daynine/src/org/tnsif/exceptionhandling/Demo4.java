package org.tnsif.exceptionhandling;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x=3;
			int y=0;
		
			try {
				int arr[]= {2,0,78};
				System.out.println(arr[4]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("exception handled "+e);
			}
			System.out.println("result"+(x/y));
		}
		catch(ArithmeticException e) {
		      System.out.println("exception handled "+e);
		}
		
//		catch(ArithmeticException e) {
//			System.out.println("exception:"+e);
//		}

	}

}
