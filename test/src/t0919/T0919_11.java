package t0919;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class T0919_11 {

	public static void main(String[] args) {
		//3.txt 읽어서 출력
		
		try {
			FileReader fr = new FileReader("c:/aaa/3.txt");
			BufferedReader br = new BufferedReader(fr);
			
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}//main

}//class
