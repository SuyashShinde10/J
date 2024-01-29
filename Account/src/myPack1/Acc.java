package myPack1;

public class Acc {
	int accno;
	String nm;
	double actbal;
	
	public Acc () {}
	
	public Acc(int accno, String nm, double actbal) {
		super();
		this.accno = accno;
		this.nm = nm;
		this.actbal = actbal;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public double getActbal() {
		return actbal;
	}

	public void setActbal(double actbal) {
		this.actbal = actbal;
	}

	@Override
	public String toString() {
		return "Acc [accno=" + accno + ", nm=" + nm + ", actbal=" + actbal + "]";
	}
	
	

	 

}
