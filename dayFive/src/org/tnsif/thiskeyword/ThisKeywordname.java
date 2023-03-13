package org.tnsif.thiskeyword;

class Account{
	int a;
	int b;
	public void setdata(int a,int b) {
		this.a=a;
		this.b=b;
	}	
		public void showdata() {
			System.out.println("value of A ="+a);
			System.out.println("value of B ="+b);
		}

}

public class ThisKeywordname {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Account obj=new Account();
	obj.setdata(2,3);
	obj.showdata();
}
}
