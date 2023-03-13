package org.tnsif.Array;
import java.util.Scanner;
class Student{
	String name;
	int id;
	char div;
	
	public Student(String name,int id,char div) {
		this.name=name;
		this.id=id;
		this.div=div;
	}
}
public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter n:");
		int n=s.nextInt();
		
		Student s1[];
		s1=new Student[n];
		
		for(int i=0;i<n;i++) {
			String name=s.next();
			s.nextLine();
			int id=s.nextInt();
			char div=s.next().charAt(0);
			s1[i]=new Student(name,id,div);
		}
		for(int i=0;i<n;i++) {
			
				System.out.println(s1[i].name);
				System.out.println(s1[i].id);
				System.out.println(s1[i].div);
			
		}
		
	}

}
