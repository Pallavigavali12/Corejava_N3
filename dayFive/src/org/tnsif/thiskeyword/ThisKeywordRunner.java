package org.tnsif.thiskeyword;
class Mathematics{
	int a,b;
	Mathematics(){
		a=12;
		b=10;
	}
	Mathematics accept() {
		return this;
	}
	void display() {
		System.out.println("value of a:"+a);
		System.out.println("value of b:"+b);
	}
}
	

public class ThisKeywordRunner {

	public static void main(String[] args) {
           Mathematics m=new Mathematics();
           (m.accept()).display(); //m.display();
	}

}
