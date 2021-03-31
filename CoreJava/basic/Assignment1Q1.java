class ArmstrongOrNot{
	public boolean armstrongCheck(int num)
	{
		int result=0;
		int x=num;
		while(num!=0)
		{
			int a=num%10;
			result+=a*a*a;
			num=num/10;
		}
		if(result==x)
		{
			return true;
		}
		else
			return false;
	}
}

public class Assignment1Q1 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		ArmstrongOrNot obj=new ArmstrongOrNot();
		System.out.println("Enter any number:");
		int n=s.nextInt();
		System.out.println(obj.armstrongCheck(n));

	}

}
