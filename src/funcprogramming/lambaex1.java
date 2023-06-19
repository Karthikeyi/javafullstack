package funcprogramming;
import java.util.function.BiFunction;
import java.util.function.Predicate;
public class lambaex1 {
	public static void main(String[] args) {
		BiFunction<String,String,String> bif=(String s1,String s2) -> s1+"-"+s2;
		System.out.println(bif.apply("sai","ram"));
		
		
		Predicate<Integer> p=n->n%2==1;
		System.out.println(p.test(6));
		
		BiFunction<Integer,Integer,Integer> bif2=(a,b)->a+b;
		System.out.println("lambda expression" +bif2.apply(2, 5));
		
		BiFunction<Integer,Integer,Integer> bif1=Integer::sum;
		System.out.println("method reference" +bif1.apply(2,5));
	}
}
