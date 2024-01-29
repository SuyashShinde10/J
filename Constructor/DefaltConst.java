class Rectangle{
	int l,b;
	Rectangle(){
		l=10;
		b=5;
	}
	int rectArea() {
		int area = l*b;
		return(area);
	}
	void display() {
		
		System.out.println("Area is : "+this.rectArea());
	}
}
public class DefaltConst {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.display();
		r.b=5;
		r.l=12;
		int area=r.rectArea();
		System.out.println("Area is : "+area);
		
	}
}
