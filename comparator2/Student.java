package in.ac.famt;

public class Student {
	int rollno;
	String name;
	int m1, m2, m3;
	public Student(int rollno,String name,int m1, int m2,int m3) {
		this.rollno=rollno;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		
		
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}
	
	
}
