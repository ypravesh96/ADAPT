abstract class calc{

	abstract int add(int a,int b);

	public int multiply(int a,int b)
	{
		return a*b;
	}
}
abstract class calc2 extends calc{

	public int multiply(int a,int b)
	{
		return a*b;
	}

}
class Addition extends calc
{
	public int add(int a,int b)
	{
		return a+b;
	}
}
public class AbstractDemo {
	public static void main(String[] args)
	{
		int a=10;
		int b=5;
		calc c=new Addition();
		int sum=c.add(a, b);
		System.out.println(sum);
	}

}
