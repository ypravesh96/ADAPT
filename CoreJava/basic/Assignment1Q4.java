package basic;
import java.util.Scanner;

class ResultDeclaration{
    public String declareResults( double subject1, double subject2, double subject3) {
    	String result=" ";
        if((subject1+subject2+subject3)<60||subject1>60||subject2>60||subject3>60)
        {
            result="failed";
        }
        else if((subject1+subject2>60)||(subject2+subject3>60)||(subject3+subject1>60))
        {
            result= "passed\npromoted";
        }
        else if ((subject1+subject2+subject3)>60)
        {
            result="passed";
        }

        return result;

    }
}

public class Assignment1Q4 {

	public static void main(String[] args) {

		int subject1,subject2,subject3;
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter subject 1 Marks");
    	subject1=s.nextInt();
    	System.out.println("Enter subject 2 Marks");
    	subject2=s.nextInt();
    	System.out.println("Enter subject 3 Marks");
    	subject3=s.nextInt();

    	ResultDeclaration result=new ResultDeclaration();
    	System.out.println(result.declareResults(subject1, subject2, subject3));
	}

}
