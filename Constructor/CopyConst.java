class CopyConStudent{
	int id;
	String name;
	CopyConStudent(int i,String n){//parameter constractor
		id=i;
		name=n;
	}
	CopyConStudent(CopyConStudent s){// copy constractor
		id=s.id;
		name=s.name;
	}
	void disply() {
		System.out.println(id+" "+name);
	}
}
public class CopyConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyConStudent c = new CopyConStudent(1,"seema");
		//c.disply();
		CopyConStudent c1 = new CopyConStudent(c);
		System.out.println(" Object c ");
		c.disply();
		System.out.println("Object c1");
		c1.disply();
	}

}
