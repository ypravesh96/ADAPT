package basic;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Assignment4Q8 {
	public static void main(String[] arg) {

		 List<Integer> list = new ArrayList<Integer>();
	   	 list.add(15);
	   	 list.add(50);
	   	 list.add(89);
	   	 list.add(70);
	   	 list.add(45);
	   	 list.add(0);

		 Thread t = new Thread(new ThreadDemo(list));
		 t.start();
	}
}

class ThreadDemo extends Thread{

	List<Integer> list = new ArrayList<Integer>();
	ThreadDemo(List<Integer> list)
	{
		this.list=list;
		}
	Consumer<List<Integer> > dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));

	public void run() {
	  dispList.accept(list);
	}

}
