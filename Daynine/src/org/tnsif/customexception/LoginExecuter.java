package org.tnsif.customexception;
import java.util.*;
public class LoginExecuter  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String username=s.nextLine();
		String password=s.nextLine();
//		loginCredential a=new loginCredential(username,password);
		try {
			if(username.equals("PallaviGavali") && password.equals("Pallavi@123")) {
				 
//				System.out.println("credential matched");
				System.out.println("matched");
//				throw new loginCredential("invalid credential","not matched");
				
			}
			
			else {
				throw new loginCredential("invalid credential","not matched");
			}
		}
		catch(loginCredential e) {
			System.out.println("Exception handled:"+e);
		}

	}

}
