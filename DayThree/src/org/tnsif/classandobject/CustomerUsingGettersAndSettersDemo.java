package org.tnsif.classandobject;
import java.util.Scanner;
public class CustomerUsingGettersAndSettersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String name=s.nextLine();
		String city=s.nextLine();
		CustomerUsingGettersAndSetters c=new CustomerUsingGettersAndSetters();
		c.setName(name);
		c.setCity(city);
		c.display();
		s.close();
		
		

	}

}
