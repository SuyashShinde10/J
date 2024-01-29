package myPack;

public class Greeting {
	String msg;
	
	public Greeting(String msg) {
		super();
		this.msg = msg;
	}

		public Greeting() {} 

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Greeting [msg=" + msg + "]";
	}
	
}
