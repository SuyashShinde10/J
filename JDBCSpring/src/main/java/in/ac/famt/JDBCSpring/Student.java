package in.ac.famt.JDBCSpring;

public class Student {
	
	public Student(String stdNM, int rollNo, int mark1, int mark2, int mark3) {
		super();
		this.stdNM = stdNM;
		this.rollNo = rollNo;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	
	String stdNM;
	int rollNo;
	int mark1,mark2,mark3;
	public Student() {
		super();
	}
	public String getStdNM() {
		return stdNM;
	}
	public void setStdNM(String stdNM) {
		this.stdNM = stdNM;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getMark1() {
		return mark1;
	}
	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}
	public int getMark2() {
		return mark2;
	}
	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
	public int getMark3() {
		return mark3;
	}
	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}
	@Override
	public String toString() {
		return "Student [stdNM=" + stdNM + ", rollNo=" + rollNo + ", mark1=" + mark1 + ", mark2=" + mark2 + ", mark3="
				+ mark3 + "]";
	}
	
	
	
	
	 
	
	
	 
	
	
	
	
}
