package myPack;

import java.util.List;

public class Questions {
	int id;
	String name;
	private List<String> ans;
	
	public List<String> getAns() {
		return ans;
	}
	public void setAns(List<String> ans) {
		this.ans = ans;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Questions [id=" + id + ", name=" + name + ", ans=" + ans + "]";
	}
	
	
	
}
