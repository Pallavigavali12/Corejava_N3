package org.tnsif.looping;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int i=1;
		while(i<=n) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		i=10;
		while(i>0) {
			System.out.print(i+" ");
			i--;
		}
//		WAP in java to print the total digits in a given number
		System.out.println();
		int x=4;
		int count=0;
		while(x!=0) {
			int r=x%10;
			x=x/10;
			count+=1;
		}
		System.out.println("count is:"+count);
	}

}
