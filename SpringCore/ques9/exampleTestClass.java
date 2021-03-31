package exampleTest;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import example.exampleClass;

public class exampleTestClass {
	public static void main(String[] args) {
	      AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

	      exampleClass obj = (exampleClass) context.getBean("helloWorld");
	      obj.getMessage();
	      context.registerShutdownHook();
	   }
}
