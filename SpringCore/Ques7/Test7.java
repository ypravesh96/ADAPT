package springAssignment7;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springAssignment7.ExaminationResult;

public class Test7 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans1.xml");
		
		ExaminationResult bean = ctx.getBean("examinationResult", ExaminationResult.class);
		
		System.out.println(bean.getResultMessage());
		System.out.println(bean.getHasPassed());
		((AbstractApplicationContext) ctx).close();
		
	}
}