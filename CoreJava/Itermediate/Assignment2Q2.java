
import java.util.ArrayList;

class Manager extends Employee{
	@Override
	public int getSalary(int salary)
	{
		int incentive=5000;
		return salary +incentive;
	}
}
class Labour extends Employee{
	@Override
	public int getSalary(int salary)
	{
		int overtime=500;
		return salary + overtime;
	}
}
public class Employee {



	int salary=10000;
	 public int getSalary(int salary) {
		return salary;}

	    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries)
	    {
	    	int total=0;
	    	for(int x:employeeSalaries)
	    	{
	    		total=total+x;
	    	}
	    	return total;
	    }

	    public static void main(String[] args) {

	    	ArrayList<Integer> employeeSalary=new ArrayList<>();
	    	Employee e=new Employee();
	    	Labour labour=new Labour();
	    	int a=labour.getSalary(10000);
	    	System.out.println("Labour Salary: "+a);
	    	Manager manager=new Manager();
			int b=manager.getSalary(10000);
			System.out.println("Manager Salary: "+b);
			employeeSalary.add(a);
			employeeSalary.add(b);
			System.out.println("Total Employee Salary: "+e.totalEmployeesSalary(employeeSalary));


	    }
	    }
