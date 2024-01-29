class Student3{
	int rn;
	String name;
	void InsertRecord(int rno,String sname) {
		rn=rno;
		name=sname;
	}
	void DisplayRecord() {
		System.out.println("Roll no = "+rn);
		System.out.println("Name = "+name);
	}
}
public class Student2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 s = new Student3();
		s.InsertRecord(1, "gayatri");
		s.DisplayRecord();
	}

}
