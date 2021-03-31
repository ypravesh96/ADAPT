import java.util.Scanner;

interface functionalInterface
{
  double calc(int a,int b);
}

public class Assignment4Q1 {

    public double addition(int num1,int num2){
    	functionalInterface a= (int i,int j) -> i+j;
    	return a.math(num1, num2);}

    public double subtraction(int num1,int num2){
    	functionalInterface s= (int i,int j)-> i-j;
    	return s.math(num1, num2);}

    public double multiplication(int num1,int num2){
    	functionalInterface m= (int i,int j)-> i*j;
    	return m.math(num1, num2);}

    public double division(int num1,int num2){
    	functionalInterface d= (int i,int j)-> (double)i/j;
    	return d.math(num1, num2);}

    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);

    	int a,b;
    	a=scan.nextInt();
    	b=scan.nextInt();
    	Assignment4Q1 result= new Assignment4Q1();

    	System.out.println("sum : "+result.addition(a,b));
    	System.out.println("difference : "+result.subtraction(a,b));
    	System.out.println("product : "+result.multiplication(a,b));
    	System.out.println("division : "+result.division(a,b));
    }
}
