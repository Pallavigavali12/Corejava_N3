package org.tnsif.exceptionhandling;
//when finally block is not executed
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[]= {1,3,5};
//			System.exit(0);
			System.out.println(arr[3]);
//			System.exit(0);
			
			
		}
		catch(Exception e) {
			System.out.println("exception occures:"+e);
//			when it calls System.exit(0);
			System.exit(0);
			
		}
//	2nd condition is when finally block contain any exceptional code	
		finally {
			System.out.println("finally block called!!");
		}

	}

}
