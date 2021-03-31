import java.util.ArrayList;
import java.util.Iterator;

public class Assignment4Q1 {

    private int totalPrice;
    private String status;

    public Assignment4Q1(int price, String status)
    {
    	this.totalPrice=price;
    	this.status=status;
    }

    public int getPrice()
    {
    	return this.totalPrice;
    }

    public void setPrice(int price)
    {
    	this.totalPrice=price;
    }

    public String getStatus()
    {
    	return this.status;
    }

    public void setStatus(String status)
    {
    	this.status=status;
    }

    public static ArrayList<Assignment4Q1> listOfOrders(ArrayList<Assignment4Q1> orders)
    {
    	Iterator<Assignment4Q1> iterator=orders.iterator();
    	while(iterator.hasNext())
    	{
    		Assignment4Q1 order=iterator.next();
    		if(order.getPrice()>10000 || order.getStatus().equals("Accepted/Completed")) {}
    	    else
    	    {
    	    	iterator.remove();
    	    }
    	}
		return orders;
	}
    public static void main(String[] args) {
    	Assignment4Q1 order1=new Assignment4Q1(20000,"Processing");
    	Assignment4Q1 order2=new Assignment4Q1(8000,"Processing");
    	Assignment4Q1 order3=new Assignment4Q1(6000,"Accepted/Completed");
    	Assignment4Q1 order4=new Assignment4Q1(45000,"Processing");
    	Assignment4Q1 order5=new Assignment4Q1(2000,"Accepted/Completed");
    	Assignment4Q1 order6=new Assignment4Q1(9000,"Processing");

    	ArrayList<Assignment4Q1> orders=new ArrayList<Assignment4Q1>();
    	orders.add(order1);
    	orders.add(order2);
    	orders.add(order3);
    	orders.add(order4);
    	orders.add(order5);
    	orders.add(order6);

    	orders=listOfOrders(orders);


    	orders.forEach((order) -> { System.out.println(order.getStatus()+" "+order.getPrice()); });
    }
}
