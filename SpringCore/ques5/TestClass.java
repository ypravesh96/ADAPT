package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Course;


public class TestClass{
	public static void main(String[] args)  {
	       
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Course details = (Course)applicationContext.getBean("course");
        details.toStrings();
    }
}
