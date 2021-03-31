import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Assignment4Q6 {
    public static void main(String[] args) {
    	Assignment4Q6 obj=new Assignment4Q6();
    	List<String> list = new ArrayList<String>();
   	    Scanner s= new Scanner(System.in);

   	    System.out.print("Enter the number of elements: ");
   	    int n= s.nextInt();


   	    for(int i=0;i<n;i++) {
   	    	System.out.print("enter the elements : ");
   		    String str= s.next();
   		    list.add(str);
   		}


   	 System.out.print(obj.convertToUpperCase(list));
    }

    public List<String> convertToUpperCase(List<String> list) {
    	UnaryOperator<String> unaryOperator = item -> item.toUpperCase();
    	list.forEach(n -> Collections.replaceAll(list,n,unaryOperator.apply(n)));

    	return list;
    }
}
