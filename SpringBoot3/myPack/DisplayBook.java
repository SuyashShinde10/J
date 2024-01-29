package myPack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DisplayBook {
	private static ApplicationContext ctx;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx = new ClassPathXmlApplicationContext("booklist.xml");
		BookList bl = (BookList) ctx.getBean("bookMap");
		System.out.println(bl);
	}

}
