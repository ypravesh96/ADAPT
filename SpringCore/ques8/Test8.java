package springAssignment8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springAssignment8.Message;

public class Test8 {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("beans8.xml");
		
		Message message = ctx.getBean("message", Message.class);
		
		System.out.println(message.getMessageId()+"\t"+message.getMessage());
		ctx.close();

	}

}