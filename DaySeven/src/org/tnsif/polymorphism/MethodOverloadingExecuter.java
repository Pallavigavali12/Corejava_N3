package org.tnsif.polymorphism;
import java.util.Scanner;
public class MethodOverloadingExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Smartphone s=new Smartphone();
		System.out.println("enter resolution:");
		s.setResolution(sc.nextInt());
		sc.nextLine();
		System.out.println("enter slottype:");
		s.setSlottype(sc.nextLine());
		s.display(s.getResolution());
		s.display(s.getResolution(),s.getSlottype());
		multiplication m = new multiplication();
		System.out.println(m.mul(3,5));
		System.out.println(m.mul(3.4f,5));
		sc.close();
		
	
		

	}

}
