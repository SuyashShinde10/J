package famt.ac.in;

public class Student {
	String name;
	int rollno;
	int m1,m2;
	public Student(String name, int rollno, int m1, int m2) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.m1 = m1;
		this.m2 = m2;
		 
	}
	 
 

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", m1=" + m1 + ", m2=" + m2 + ", m3=" +   "]";
	}
	
}
