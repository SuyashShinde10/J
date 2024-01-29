package myPack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainQuestions {
private static ApplicationContext ctx;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx= new ClassPathXmlApplicationContext("questions.xml");
		Questions que = (Questions) ctx .getBean("qbean");
		System.out.println(que);
		

	}

}
