package Collections;
import java.util.Set;
import java.util.TreeSet;

public class csample2 {
	public static void main(String[] args) {
		Set<Student> s=new TreeSet<Student>();
		
		Student s1=new Student(110,"sri");
		Student s2=new Student(111,"sree");
		Student s3=new Student(112,"sai");
		Student s4=new Student(113,"janu");
		Student s5=new Student(114,"leku");
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		System.out.println(s);
		
	}
}
class Student implements Comparable<Student> 
{
	private int id;
	private String name;
	public Student(int id,String name)
	{
		super();
		this.id=id;
		this.name=name;
	}
	public int getId(int id)
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String ToString()
	{
		return "Student[id=" +id +"name=" +name+"]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}
}
