package demoOfMaven;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import demoOfMaven.Greeting;

public class DemoMaven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("appconfig.xml");
		Greeting grt = (Greeting) ctx.getBean("greet");
		System.out.println(grt.getStrmsg());
		grt.setStrmsg("Hello ,this is demo Maven Project Example");
		System.out.println(grt.getStrmsg());
		 
	}

}
