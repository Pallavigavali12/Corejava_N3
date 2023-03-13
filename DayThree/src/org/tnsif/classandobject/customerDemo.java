package org.tnsif.classandobject;
import java.util.Scanner;
public class customerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int i=1;
		while(i<=3) {
			System.out.println("enter value of id:");
			int id=s.nextInt();
			s.nextLine();

			System.out.println("enter name:");
			String name=s.nextLine();
			
			System.out.println("enter age:");
			int age=s.nextInt();
			
			System.out.println("enter city:");
			String city=s.next();
			
			Customer c=new Customer(id,name,age,city);
			c.display();
			i++;

		}
		
//		for(int i=0;i<3;i++) {
//			Customer c[i]=new Customer(id,name,age,city);
//			c[i].display();
//		}
//		
//		
//		c.display();
		s.close();

	}

}
