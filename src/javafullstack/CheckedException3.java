package javafullstack;
import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CheckedException3 {
	public static void main(String[] args)   {
		FileOutputStream fs=null;
		try {
			fs = new FileOutputStream("s.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("filenotfound");
		}
		try {
			fs.write("checked exception".getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("e.getMessage");
		}
		try {
			fs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("e.getMessage()");
		}
		if(fs!=null)
		{
			System.out.println("success");
		}
	}
}
