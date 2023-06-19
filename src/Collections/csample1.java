package Collections;

import java.util.ArrayList;
import java.util.Vector;
public class csample1 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("hi");
		list.add("karthikeyi");
		list.add("u dont like men");
		list.add(new String("her"));
		//list.add(new StringBuilder("his"));
		//list.add(Integer.valueOf(101));
		System.out.println(list);
		list.forEach(System.out::println);
		
		ArrayList<Integer> i=new ArrayList<>(20);
		i.add(100);
		i.add(200);
		i.add(300);
		System.out.println(i);
		
		Vector<Double> doubles=new Vector<>();
		doubles.add(200.0);
		System.out.println(doubles);
		
		Vector<Boolean> bool=new Vector<>();
		bool.add(false);
		bool.add(true);
		System.out.println(bool);
		
		
		
	}
}
