package in.ac.famt.SpringBootWebDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootWebDemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootWebDemoApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(SpringBootWebDemoApplication.class, args);
		Greeting grt = ctx.getBean(Greeting.class);
		grt.setMsg("Hello I am Suyash ," + "Studying in FAMT");
	}

}
