package myPack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 

public class AccountJava {
	private static ApplicationContext ctx;  
		
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx = new ClassPathXmlApplicationContext("accConfig.xml");
		Acc accObj = (Acc) ctx.getBean("accmn");
		System.out.println("Msg - "+ accObj);

	}

}
