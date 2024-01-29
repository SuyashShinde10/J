class Student5{
	int rn,sub1,sub2,tot,avg;
	String name,res;
	
	void setStudebt(String name,int rn,int sub1,int sub2) {
		this.name = name;
		this.rn = rn;
		this.sub1 = sub1;
		this.sub2 =sub2;
	}
	void cal() {
		tot = sub1+sub2;
		avg=tot/2;
		if(avg>35) {
			res="pass";
		}else {
			{
				res="fail";
			}
		}
	}
	void Dispay() {
		System.out.println("Roll no : "+rn);
		System.out.println("Name is : "+name);
		System.out.println("Maths   : "+sub1);
		System.out.println("English : "+sub2);
		System.out.println("Total   : "+tot);
		System.out.println("Avrage  : "+avg);
		System.out.println("Result  : "+res);
	}
}
public class Student4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student5 s = new Student5();
		s.setStudebt("sumit", 10, 60, 80);
		s.cal();
		s.Dispay();
	}

}
