package myPack;

public abstract class Box extends org.apache.jasper.runtime.HttpJspBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public double calcArea(double l, double w) {
		return l* w;
	}
}
