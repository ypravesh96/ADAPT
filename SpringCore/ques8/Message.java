package springAssignment8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Message  {

	private int messageId;
	private String message;
	
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@PostConstruct
	public void init() throws Exception {
		System.out.println("Bean is going through init process..");
	}
	
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("Bean is going to destroy..");
	}
}