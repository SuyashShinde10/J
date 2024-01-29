class Area{
	double a,b,h;
	void read(double b,double h) {
		
		this.b=b;
		this.h=h;
	}
	void cal() {
		a=0.5*h*b;
	}
	void show() {
		System.out.println("Triangle hight : "+h);
		System.out.println("Triangle base  : "+b);
		System.out.println("Triangle area  : "+a);
	}
}
public class Tringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area c = new Area();
		c.read(5, 5);
		c.cal();
		c.show();
	}

}
