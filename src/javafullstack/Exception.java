package javafullstack;
import java.util.Scanner;

public class Exception {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter index");
		int n=sc.nextInt();
		int[] ints = {2,3,4,5,7};
		try
		{
			System.out.println(ints[n]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("index out of range");
		}
		System.out.println("outside the block");
		
	}
}
