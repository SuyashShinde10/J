package myPack3;

public class addr {
	int id;
	String location;
	public addr(int id, String location) {
		super();
		this.id = id;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "addr [id=" + id + ", location=" + location + "]";
	}
	

}
