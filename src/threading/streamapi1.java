package threading;

import java.util.stream.IntStream;

public class streamapi1 {
	public static void main(String[] args) {
		//imperative programming
		int[] i= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		//find sum of even numbers
		for(int j:i)
		{
			if(j%2==0)
			{
				sum=sum+j*j;
			}
		}
		System.out.println(sum);
		
		//functional programming
		System.out.println("using restapi in java");
		System.out.println(IntStream.of(i).filter(x->x%2==0).map(n->n*n).sum());
	}
}

