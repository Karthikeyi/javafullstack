package Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class setcollection1 {
	public static void main(String[] args) {
		
		//HASHSET = doesn't follow any order
		Set<String> s=new HashSet<>();
		s.add("hi");
		s.add("hi");
		s.add("fullstack");
		s.add("karthi");
		s.add(null);
		s.add(null);
		System.out.println(s);
		
		//LINKEDHASHSET = first inserted first displayed	
		Set<Integer> i=new LinkedHashSet<>();
		i.add(10);
		i.add(2);
		i.add(3);
		System.out.println("integer size:" +i.size());
		System.out.println(i);
		
		//TREESET = sorting order
		Set<String> t=new TreeSet<>();
		t.add("hi");
		t.add("karthi");
		t.add("mouni");
		t.add("leku");
		t.add("jahnavi");
		t.add("madhu");
		t.add("sowji");
		t.add("vinay");
		t.add("bhanu");
		t.add("nithin");
		System.out.println(t);
		
		
		
	}
}
