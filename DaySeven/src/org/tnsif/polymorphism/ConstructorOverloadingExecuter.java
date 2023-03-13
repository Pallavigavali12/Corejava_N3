package org.tnsif.polymorphism;
import java.util.Scanner;
public class ConstructorOverloadingExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Hondacity h=new Hondacity();
		Scanner s=new Scanner(System.in);
//		System.out.println("enter speed and color:");
		Hondacity h2=new Hondacity();
		h2.setColor(s.nextLine());
		h2.setSpeed(s.nextInt());
		Hondacity h3=new Hondacity(h2.getSpeed(),h2.getColor());
//		Hondacity h2=new Hondacity(126,"Black");
		
		

	}

}
