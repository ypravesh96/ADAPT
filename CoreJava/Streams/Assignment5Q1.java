

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Fruit {
    String name;
    private int calories;
    private int price;
    private String color;

    public Fruit(String name,int calories,int price,String color)
    {
    	this.name=name;
    	this.calories=calories;
    	this.price=price;
    	this.color=color;
    }
    public String getName() {
    	return name;
    }

    public void setName(String name) {
    	this.name = name;
    }

    public int getCalories() {
    	return calories;
    }

    public void setCalories(int calories) {
    	this.calories = calories;
    }

    public int getPrice() {
    	return price;
    }

    public void setPrice(int price) {
    	this.price = price;
    }

    public String getColor() {
    	return color;
    }

    public void setColor(String color) {
    	this.color = color;
    }

    public String toString(){ return "Fruit{name='"+this.name+"', "+"calories="+this.calories+", "+"price="+this.price+", "+"color='"+this.color+"'}";}

}

public class Assignment5Q1 {


		  public static List<String> reverseSort(ArrayList<Fruit> fruits1)
		    {
		    	List<Fruit> Fruits=fruits1.stream().filter(a->a.getCalories()<100).sorted(Comparator.comparing(Fruit::getCalories).reversed()).collect(Collectors.toList());
		    	List<String> FruitString =new ArrayList<String>();
		    	//System.out.println(Fruits.size());
		    	for(int i=0;i<Fruits.size();i++)
		    	{
		    		FruitString.add(Fruits.get(i).name);
		    	}
		    	//System.out.println(Fruit);
		    	return FruitString;
		    }
		  public static ArrayList<Fruit> sort(ArrayList<Fruit> fruits)
		    {
		    	ArrayList<Fruit> Fruits=new ArrayList<Fruit>();
		    	fruits.stream().sorted(Comparator.comparing(Fruit::getColor)).forEach(fruit->Fruits.add(fruit));
				return Fruits;
			}
		  public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits)
		    {
		    	ArrayList<Fruit> Fruits=new ArrayList<Fruit>();
		    	fruits.stream().filter(p->p.getColor()=="Red").sorted(Comparator.comparing(Fruit::getPrice)).forEach(fruit->Fruits.add(fruit));

		    	return Fruits;
		    }



	public static void main(String[] args) {

	    	ArrayList<Fruit> fruits=new ArrayList<Fruit>();
	    	Scanner s=new Scanner(System.in);
	    	System.out.println("Enter number of fruits.");
	    	int n=s.nextInt();
	    	for(int i=0;i<n;i++)
	    	{
	    		System.out.println("Enter name of fruit: ");
	    		String name=s.next();
	    		System.out.println("Enter calories: ");
	    		int calories=s.nextInt();
	    		System.out.println("Enter price: ");
	    		int price=s.nextInt();
	    		System.out.println("Enter color: ");
	    		String color=s.next();
	    		fruits.add(new Fruit(name,calories,price,color));

	    	}
	    	System.out.println("Printing fruit having calorie less than 100");
	    	List<String> fruit1=reverseSort(fruits);
	    	fruit1.forEach((fruit)-> { System.out.println(fruit); });
	    	System.out.println("Printing fruit colourwise");

	    	List<Fruit> fruit2 = sort(fruits);
	    	fruit2.forEach((fruit)->{System.out.println(fruit);});
	    	System.out.println("Printing fruits red in colour");

	    	List<Fruit> fruit3 = filterRedSortPrice(fruits);
	    	fruit3.forEach((fruit)->{System.out.println(fruit);});





	}

}
