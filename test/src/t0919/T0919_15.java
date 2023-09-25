package t0919;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class T0919_15 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis1 = new FileInputStream("c:/aaa/lee1.jpg");
		FileInputStream fis2 = new FileInputStream("c:/aaa/lee2.jpg");
		FileOutputStream fos1 = new FileOutputStream("c:/cba/lee1.jpg");
		FileOutputStream fos2 = new FileOutputStream("c:/cba/lee2.jpg");
		
		while(true) {
			int read1 = fis1.read();
			if(read1==-1) break;
			fos1.write(read1);
		}
		
		fis1.close();
		fos1.close();
		System.out.println("lee1파일이 복사되었습니다.");

		while(true) {
			int read2 = fis2.read();
			if(read2==-1) break;
			fos2.write(read2);
		}
		
		fis2.close();
		fos2.close();
		System.out.println("lee2파일이 복사되었습니다.");
	}

}
