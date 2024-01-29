package myPack;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Greeting {
	private String strMsg;
	
	@Value ("Hello Spring")
	public void setStrMsg(String strMsg) {
		this.strMsg = strMsg;
	}
	public void greetUser() {
		System.out.println(strMsg);
	}
	 
	 
}
