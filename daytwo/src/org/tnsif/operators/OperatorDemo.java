package org.tnsif.operators;
import java.util.Scanner;
public class OperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of x:");
//		arithmetic operators +,-,*,/,% 
		int x=sc.nextInt();
		System.out.println("enter value of y:");
		int y=sc.nextInt();
		System.out.println("addition is:"+(x+y));
		System.out.println("substraction is:"+(x-y));
		System.out.println("multiplication is:"+(x*y));
		System.out.println("division is:"+(x/y));
		System.out.println("remainder is:"+(x%y));
//		relational oprtaors >,<,>=,<=,== 
		
		boolean result=(x>y);
		System.out.println(result);
		boolean result1=(x<y);
		System.out.println(result1);
		boolean result2=(x==y);
		System.out.println(result2);
//		ternary operator ?:
		int n;
		System.out.println("enter value of n:");
		n=sc.nextInt();
		String result3=(n%2==0)?"even":"odd";
		System.out.println(result3);
//		bitwise operators &,|,^ ,>>,<<
		int i=5;
		int j=3;
		System.out.println(i&j);
		System.out.println(i|j);
		System.out.println(i^j);
//		i*(2^j)
		System.out.println(i<<j); 
//		i/(2^j)
		System.out.println(i>>j);
				
//		logical oprtaors &&,||,!
		int d=5;
//		in and both conditions should be true
		boolean r=(d==5)&&(d<10);
		System.out.println(r);
//		in or at least one condition should be true
		boolean s=(d==5)||(d<10);
		System.out.println(s);
//		inverse the result
		boolean t=!(d==5);
		System.out.println(t);
		
//		assignment operators +=,-=,*=,/=,%=,= 
		int w=10;
		int e=1;
		e+=w;
		System.out.println(e);
		System.out.println(w);
//		increment and decrement operators ++,--
		int a=12;
		int b=6;
		int c=++a + b++;
		System.out.println(c);
		System.out.println(b);
		
		int p=56;
		System.out.println(p++);
		System.out.println(++p);
		
		int q=8;
		System.out.println(--q);
		System.out.println(q--);
		System.out.println(q);
		
		sc.close();
		

	}

}
