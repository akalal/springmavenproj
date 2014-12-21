package com;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.HelloWorld;
 
public class HelloApp {
	public static void main(String[] args) {
		 HelloApp obj = new HelloApp();
		obj.execute();
	}
	
	void execute(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");
 
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();
	}
	
	public String getPropName(){
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");
 
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		
		return obj.getName();
	}
}