package t0919;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class T0919_09 {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("c:/aaa/1.txt");
			
			int read = 0;
			while ((read = is.read()) != -1) {
				System.out.println((char)read);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}//main

}//class
