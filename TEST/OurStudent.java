
public class OurStudent {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.Insertrecord();
		s1.DisplayRecord();
	}

}
class Student{
	int rn;
	String name;
	
	void Insertrecord() {
		rn = 1;
		name =  "Gayatri";
	}
	void DisplayRecord(){
		System.out.println("Roll no. = "+rn);
		System.out.println("Name = "+name);
	}
}