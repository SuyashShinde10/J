package myPack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
 private static  ApplicationContext ctx;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx = new ClassPathXmlApplicationContext("appctx.xml");
		Operation op = (Operation)ctx.getBean("optBean");
		System.out.println("calling displayMsg()...");
		op.displayMsg("Hello...!");
	}

}
