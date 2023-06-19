package javafullstack;

public class UncheckedException2 {
	public static void main(String[] args) throws  InterruptedException{
		for(int i=0;i<20;i++)
		{
			Thread.sleep(5000);
			System.out.println(i);
		}
	}
}
