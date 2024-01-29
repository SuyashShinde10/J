package myPack2;

public class emp {
	String nm;
	int id;
	public addr(String nm, int id) {
		super();
		this.nm = nm;
		this.id = id;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "addr [nm=" + nm + ", id=" + id + "]";
	}
	
}
