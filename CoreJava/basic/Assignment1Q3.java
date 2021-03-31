package basic;
import java.util.Scanner;

class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
    	double interest = (principalAmount*interestRate*time) / 100;
    	return interest;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
    	double interest = principalAmount * (Math.pow((1 + interestRate/100), (time))) - principalAmount;
    	return interest;
    }
}
public class Assignment1Q3 {
    public static void main (String args[]) {
    	Scanner s=new Scanner(System.in);
    	System.out.print("Enter Principal: ");
    	int principal=s.nextInt();
    	System.out.print("Enter Time: ");
    	int time=s.nextInt();
    	System.out.print("Enter Interest Rate: ");
    	int rate=s.nextInt();
    	SiCi si=new SiCi();
    	double SimpleIntesest=si.simpleInterest(principal, time, rate);
    	double CompoundInterest=si.compoundInterest(principal, time, rate);
    	System.out.println("Simple Interest: "+SimpleIntesest+"\n"+"Compund Interest: "+CompoundInterest);

    }
}
