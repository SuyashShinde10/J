package in.ac.famt.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoProjectApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootDemoProjectApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(SpringBootDemoProjectApplication.class, args);
		System.out.println("Hello Suyash!!!");
		Greeting grt = ctx.getBean(Greeting.class);
		grt.setMsg("This is first program!");
		System.out.println(grt.getMsg());
		
	}

}
