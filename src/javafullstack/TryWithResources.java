package javafullstack;
import java.util.Scanner;

public class TryWithResources {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter number");
			int n=sc.nextInt();
			System.out.println(n);
			//sc.close();
		}
	}
}
