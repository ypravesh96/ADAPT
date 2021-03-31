package Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.ApplicationContextAwareImpl;

public class TestClass {
	public static void main(String[] args) {
	       
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
 
        ApplicationContextAwareImpl applicationContextAwareImpl = (ApplicationContextAwareImpl) applicationContext.getBean("applicationContextAware");
       
        System.out.println("Application context aware output: ");
        applicationContextAwareImpl.displayStudentDetails();
       
        applicationContext.registerShutdownHook();
    }

}
