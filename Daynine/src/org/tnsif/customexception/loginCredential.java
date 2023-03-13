package org.tnsif.customexception;
//program to demonstrate custom exception
public class loginCredential extends Exception {
	
	String password;
	String username;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public loginCredential(String username,String password) {
		this.username=username;
		this.password=password;
		
	}

	@Override
	public String toString() {
		return "loginCredential [password=" + password + ", username=" + username + "]";
	}
	

}
