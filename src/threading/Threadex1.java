package threading;

public class Threadex1 {
	public static void main(String[] args) throws InterruptedException {
		Runnable task1=() -> {
			for(int i=1;i<10;i++)
			{
				System.out.println(Thread.currentThread().getName()+":" +i);
			}
		};
		Runnable task2=() -> {
			for(int j=30;j<40;j++)
			{
				System.out.println(Thread.currentThread().getName()+":" +j);

			}
		};
		
		Thread t1=new Thread(task1);
		t1.join(); //completes thread1 task totally without any interruption.
		//t1.setName("Thread1");
		Thread t2=new Thread(task2);
		//t2.setName("Thread2");
		t1.start();
		t2.start();
		
	}
}
