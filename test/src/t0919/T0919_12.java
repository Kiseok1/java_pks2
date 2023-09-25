package t0919;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class T0919_12 {

	public static void main(String[] args) {
		//outputStream 저장 
		
		try {
			OutputStream os = new FileOutputStream("c:/cba/4.txt");
			String str = "Hello, World! 안녕 123";
			byte[] bytes = str.getBytes();
			for (byte b:bytes) {
				os.write(b);
			}
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("파일이 저장되었습니다.");

	}

}
