class Cal{
	void sum(int a,int b) {
		System.out.println(a+b);
	}
	void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}
}
public class MethodOverLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal c = new Cal();
		c.sum(1, 2);
		c.sum(1,20,300);
	}

}
