class SingletonInheritanceCheck{
	private static SingletonInheritanceCheck a=null;
	int b;
	private SingletonInheritanceCheck() {
		b=10;
	}
	public static SingletonInheritanceCheck getInstance() {
		if(a==null)
			a=new SingletonInheritanceCheck();
		return a;
	}
}

public class Assignment2Q1 {
	public static void main(String[] args) {
		SingletonInheritanceCheck s=SingletonInheritanceCheck.getInstance();
		s.b=20;
		System.out.print("Singleton Instance value: "+s.b);
	}
}
