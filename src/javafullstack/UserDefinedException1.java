package javafullstack;
import java.util.Scanner;
public class UserDefinedException1 extends Exception {
	public UserDefinedException1(String message)
	{
		super(message);
	}
}

class User1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		try
		{
			process(n);
		}
		catch(UserDefinedException1 e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void process(int number) throws UserDefinedException1 
	{
		if(number%2==0)
		{
			System.out.println(number+"is a even number");
		}
		else
		{
			throw new UserDefinedException1(number + "is not even");
		}
	}
}