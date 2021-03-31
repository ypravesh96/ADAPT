
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Trader {
    private String name;
    private String city;


	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName()
	{
		return name;
	}
	public String getCity()
	{
		return city;
	}

	public String toString(){ return "{name='"+this.name+"', city='"+this.city+"'}";}
}
class Transaction {
    private Trader trader;
    private int year;
    private int value;

	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Trader getTrader() {return trader;}
	public int getYear() {return year;}
	public int getValue() {return value;}

	public String toString(){ return "Transaction{trader=Trader"+this.trader+", year="+this.year+", value="+this.value+"}";}

}
public class Assignment5Q4 {

    public static List<Transaction> sortTransactions(List<Transaction> transactions)
    {
    	List<Transaction> list=new ArrayList<>();
    	transactions.stream().filter(x->getYear()==2011).forEach(p->list.add(p));

    	return list;
    }

    private static int getYear() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static List<Integer> transactionsValuesDelhi(List<Transaction> transactions)
    {
    	List<Integer> list = new ArrayList<>();
        transactions.stream().filter(c -> c.getTrader().getCity().equalsIgnoreCase("delhi")).forEach(e -> list.add(e.getValue()));
   	    return list;
    }
    public static int highestTransaction(List<Transaction> transactions)
    {
    	List<Integer> list = new ArrayList<>();
     	transactions.stream().forEach(e -> list.add(e.getValue()));

     	int max = list.stream().max(Comparator.comparing(i -> i)).get();
     	return max;
    }

    public static int smallestTransaction(List<Transaction> transactions)
    {
    	List<Integer> list = new ArrayList<>();
     	transactions.stream().forEach(e -> list.add(e.getValue()));

     	int min = list.stream().max(Comparator.comparing(i -> -i)).get();
     	return min;
    }

    public static void main(String[] args)
    {
    	List<Transaction> list=new ArrayList<>();
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter the number of traders");
    	int n=s.nextInt();
    	for(int i=1;i<=n;i++)
    	{
    		System.out.println("Enter the name of traders "+i+" : ");
    		String name=s.next();
    		System.out.println("Enter the city of traders "+i+" : ");
    		String city=s.next();
    		System.out.println("Enter the year of transaction "+i+" : ");
    		int year=s.nextInt();
    		System.out.println("Enter the value of transaction "+i+" : ");
    		int value=s.nextInt();
    		list.add(new Transaction(new Trader(name,city),year,value));
    	}
    	sortTransactions(list).forEach(k-> System.out.println(k));
    	transactionsValuesDelhi(list).forEach(k-> System.out.println(k));
    	System.out.println(highestTransaction(list));
    	System.out.println(smallestTransaction(list));

    }
}
