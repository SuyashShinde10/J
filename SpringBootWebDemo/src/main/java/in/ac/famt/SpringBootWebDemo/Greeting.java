package in.ac.famt.SpringBootWebDemo;

import org.springframework.stereotype.Service;

@Service
public class Greeting {
	String msg;

	public Greeting() {
		super();
	}

	public Greeting(String msg) {
		super();
		this.msg = msg;
	}

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
