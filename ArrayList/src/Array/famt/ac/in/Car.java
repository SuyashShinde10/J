package Array.famt.ac.in;

public class Car implements Comparable<Car>{
	int Cid;
	String Cname;
	int price;
	public Car(int cid, String cname, int price) {
		super();
		Cid = cid;
		Cname = cname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [Cid=" + Cid + ", Cname=" + Cname + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return Cname.compareToIgnoreCase(o.Cname);
		
	}
	
	

}
