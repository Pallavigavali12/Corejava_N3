package org.tnsif.thiskeyword;
class HR{
	public void display(HR obj) {
		System.out.println("Human Resourse");
	}
	void accept() {
		display(this);
	}
}
public class ThisKeywordExecuter {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HR obj=new HR();
		obj.accept();

	}

}
