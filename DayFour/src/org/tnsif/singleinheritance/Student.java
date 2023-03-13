package org.tnsif.singleinheritance;

public class Student extends Citizen {
	private int rollno;
	private String studname;
	
//	generate getters and setters
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
//	public Student(int rollno, String studname) {
//		super();
//		this.rollno = rollno;
//		this.studname = studname;
//	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String adharno, String city, long mob_no) {
		super(name, adharno, city, mob_no);
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, String adharno, String city, long mob_no, int rollno, String studname) {
		super(name, adharno, city, mob_no);
		this.rollno = rollno;
		this.studname = studname;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", studname=" + studname + ", getRollno()=" + getRollno()
				+ ", getStudname()=" + getStudname() + ", getName()=" + getName() + ", getAdharno()=" + getAdharno()
				+ ", getCity()=" + getCity() + ", getMob_no()=" + getMob_no() + "]";
	}
	
	
	
	
	
	
	
	

}
