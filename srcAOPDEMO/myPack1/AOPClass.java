package myPack1;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AOPClass {
	@Pointcut ("execution (public void Operation.displayMsg(..))")
	public void PointcutMethod() {
		
	}
	@After("PointcutMethod()")
	public void logAsPerPointcutExp() {
	Calendar cal = Calendar.getInstance();
	System.out.println("Logging aspect: Demo of Pointcut expression.");
	Logger log = Logger.getLogger("");
	log.log(Level.INFO,"**** Inside of logAsPerPointcutExp() **** at");
	}
	//@Before ("execution(public void Operation.*(..))")
	//@Before("within(myPack.*)")
	//@AfterReturning("execution(public void Operation.*(..))")
	//@Before("args(java.lang.String)")
	//@After("args(java.lang.String)")
	public void doSmthing(JoinPoint jp) {
		System.out.println("Inside d AOPClass....1 ");
		String packageName = jp.getSignature().getDeclaringTypeName();
		String methodName = jp.getSignature().getName();
		System.out.println("Existing method ["+ packageName + "." + methodName +"];");
		}
	
	@AfterReturning("bean(optBean)")
	public void callMe(JoinPoint jp) {
		System.out.println("Inside d AOPClass BeanPointCut");
		String packageName = jp.getSignature().getDeclaringTypeName();
		String methodName = jp.getSignature().getName();
		System.out.println("Existing method ["+ packageName + "." + methodName +"];"); 
	}
	
	@Before ("target(myPack1.TargetInf)")
	public void targetCall(JoinPoint jp) {
		System.out.println("Calling Interface method...");
		String packageName = jp.getSignature().getDeclaringTypeName();
		String methodName = jp.getSignature().getName();
		System.out.println("Existing method ["+ packageName + "." + methodName +"];"); 
	}
}
