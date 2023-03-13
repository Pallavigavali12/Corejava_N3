package org.tnsif.exceptionhandling;

import java.io.IOException;

public class ThrowKeywordDemo {
//	throws is used to declare an exception
	public static void donate(int age,int weight)throws Exception {
		if(age>18 && weight>50) {
			System.out.println("eligible to donate blood");
		}
		else {
			throw new IOException("not eligible");
		}
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		try {
			donate(23,34);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
	}

}
