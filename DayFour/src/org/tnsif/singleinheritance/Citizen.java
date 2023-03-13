package org.tnsif.singleinheritance;

public class Citizen {
//	private data members
	private String name;
	private String adharno;
	private String city;
	private long mob_no;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdharno() {
		return adharno;
	}
	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMob_no() {
		return mob_no;
	}
	public void setMob_no(long mob_no) {
		this.mob_no = mob_no;
	}
//	default constructor
	public Citizen() {
		System.out.println("Parent Class");
	}
//	parametrised constructor
    public Citizen(String name, String adharno, String city, long mob_no) {
	    super();
	    this.name = name;
	    this.adharno = adharno;
	    this.city = city;
	    this.mob_no = mob_no;
     }
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adharno=" + adharno + ", city=" + city + ", mob_no=" + mob_no + "]";
	}
    
    
    

	
	

	

}
