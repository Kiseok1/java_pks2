package t0919;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class T0919_14 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("c:/aaa/ko1.jpg");
		FileOutputStream fos = new FileOutputStream("c:/cba/ko1.jpg");
		
		while(true) {
			int read = fis.read();
			if(read==-1) break;
			fos.write(read);
		}
		
		fis.close();
		fos.close();
		
		System.out.println("파일이 복사되었습니다.");

	}

}
