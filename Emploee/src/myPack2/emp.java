package myPack2;

public class emp {
	int id;
	String nm;
	public emp(int id, String nm) {
		super();
		this.id = id;
		this.nm = nm;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	@Override
	public String toString() {
		return "emp [id=" + id + ", nm=" + nm + "]";
	}
	
	
}
