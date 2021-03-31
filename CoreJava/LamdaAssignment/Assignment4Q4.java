
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Assignment4Q4 {
    public ArrayList<String> removeOddLength(ArrayList<String> employeeList){
    	Predicate<String> pre = e -> e.length()%2==1;
    	employeeList.removeIf(pre);
    	return employeeList;
    }
    public static void main(String[] args) {
    	Scanner s= new Scanner(System.in);

    	ArrayList<String> arrayList= new ArrayList<String>();

    	System.out.print("enter the number of Strings you want to insert : ");
    	int i= s.nextInt();

    	for (int j=0;j<i;j++){

	    	System.out.print("enter the string "+(j+1)+" : ");
	    	String str= s.next();

	    	arrayList.add(str);
    	}
    	new Assignment4Q4().removeOddLength(arrayList).forEach(n -> System.out.println(n));
    }
}
