package com.springtest;   
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 

public final class MainApp {
	
	public static void main(String[] args) throws Exception { 
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		Animal animal = (Animal)ctx.getBean("animal");
		printLog("Animal Name:"+ animal.getName());
		
		Tiger tiger=(Tiger)ctx.getBean("tiger");
		printLog("tiger's name is:" + tiger.getName());
		printLog("tiger's age is:" + tiger.getAge());
		
		
	        ctx.registerShutdownHook();   
	   }
	
	
	
	public static void printLog(String msg){
		System.out.println(msg);
	}
	
}
