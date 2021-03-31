package example;

public class exampleClass {
	private String message;

	public void getMessage() {
		System.out.println(".\n..\n...Starting..."+message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init(){
	    System.out.println("Bean is going through init.");
	}

    public void destroy() {
	    System.out.println("Bean will destroy now.");
	}
}
