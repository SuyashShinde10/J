package myPack;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GreetingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfig.class);
		Greeting greet = ctx.getBean(Greeting.class);
		greet.setStrMsg("Hello World !");
		greet.greetUser();
		ctx.close();
	}

}
