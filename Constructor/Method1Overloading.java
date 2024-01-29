class Cal1{
	void sum(int a,int b) {
		System.out.println(a+b);
	}
	void sum(double b,double c,double a) {
		System.out.println(a+b+c);
	}
	void sum(char a,char b) {
		System.out.println(a+b);
	}
	void sum(String a,String b) {
		System.out.println(a+b);
	}
}
public class Method1Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal1 c = new Cal1();
		c.sum(5, 15);
		c.sum(1.5, 2.5, 3.4);
		c.sum('a', 'b');
		c.sum("hii", "sumit");
	}
}
