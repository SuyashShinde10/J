package Array.famt.ac.in;

public class Student implements Comparable<Student> {

	 int id,rollno;
	 String name,address;
	 int m1,m2,m3;
	 
	 
	 public Student(int id,String name,String address,int rollno,int marks, int m1, int m2, int m3) {
			this.id=id;
			this.name =name;
			this.address =address;
			this.rollno =rollno;
			this. m1 = m1; 
			this. m2 = m2; 
			this. m3 = m3; 
	 }
			@Override
			public int compareTo(Student o) {
				if (m1+m2+m3==o.m1)
					 return 1;
				 else if (m1+m2+m3<o.m1)
					 return 0;
				 else  
					 return -1;
			}
			@Override
			public String toString() {
				return "Student [id=" + id + ", rollno=" + rollno + ", name=" + name + ", address=" + address + ", m1="
						+ m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
			}


}
