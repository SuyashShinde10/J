class Emp{
	int empno;
	String name;
	double bsal,hra,da,pf,it,netsal,gross_sal;
	void read(int empno,String name,double bsal) {
		this.empno=empno;
		this.name=name;
		this.bsal=bsal;
	}
	void cal() {
		if(bsal<5000) {
			hra = bsal*0.25;
			da = bsal*0.15;
			pf = bsal*0.08;
			it = bsal*0.05;
		}else if(bsal<=5000) {
			hra = bsal*0.40;
			da = bsal*0.30;
			pf = bsal*0.20;
			it = bsal*0.10;
		}
		gross_sal= bsal+hra+da;
		netsal = gross_sal-(pf+it);
		
	}
	void show() {
		System.out.println("---------------------------------------------------");
		System.out.println("                       FAMT                        ");
		System.out.println("                    Ratnagiri                      ");
		System.out.println("---------------------------------------------------");
		System.out.println("                 Employee Pay Slip                 ");
		System.out.println("---------------------------------------------------");
		System.out.println("Id                   : "+empno);
		System.out.println("Name                 : "+name);
		System.out.println("salary               : "+bsal);
		System.out.println("House Rent Allowencs : "+bsal);
		System.out.println("Dearness Allowencs   : "+bsal);
		System.out.println("Provident Fount      : "+bsal);
		System.out.println("Income Tax           : "+bsal);
		System.out.println("Gross Salary         : "+gross_sal);
		System.out.println("---------------------------------------------------");
		System.out.println("    net salary       : "+netsal);
		System.out.println("---------------------------------------------------");
		System.out.println();
	}
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e = new Emp();
		e.read(1, "Sumit", 5000);
		e.cal();
		e.show();
		e.read(2, "Pooja", 10000);
		e.cal();
		e.show();
	}

}
