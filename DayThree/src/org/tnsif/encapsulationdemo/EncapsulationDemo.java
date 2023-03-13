package org.tnsif.encapsulationdemo;
import java.util.Scanner;
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Hdfc h=new Hdfc();
		System.out.println("enter pin:");
		h.setPin(s.nextInt());
		h.accept();
		s.close();

	}

}
