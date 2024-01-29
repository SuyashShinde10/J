package Array.famt.ac.in;

public class Stud implements Comparable<Stud> {
	int rollNo;
	String nm;
	int m1, m2, m3;
	public Stud(int rollNo, String nm, int m1, int m2, int m3) {
		super();
		this.rollNo = rollNo;
		this.nm = nm;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	@Override
	public String toString() {
		return "Stud [rollNo=" + rollNo + ", nm=" + nm + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}
	@Override
	public int compareTo(Stud o) {
		// TODO Auto-generated method stub
		if (m1+m2+m3 > o.m1+m2+m3)
			return 1;
		else if (m1+m2+m3 < o.m1+m2+m3) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
