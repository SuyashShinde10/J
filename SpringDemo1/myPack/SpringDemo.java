package myPack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("greeting.xml");
		Greeting grt = (Greeting) ctx.getBean("gr");
		System.out.println(grt.getMsg() );
		ctx.close();
		
	}

}
