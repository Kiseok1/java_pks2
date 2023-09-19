package p0919;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class J0919_15 {

	public static void main(String[] args) throws Exception {
		// lee1,lee2 -> bbb폴더 2개를 복사하시오

		FileInputStream fis1 = new FileInputStream("c:/aaa/lee1.jpg");
		FileInputStream fis2 = new FileInputStream("c:/aaa/lee2.jpg");
		FileOutputStream fos1 = new FileOutputStream("c:/bbb/lee1.jpg");
		FileOutputStream fos2 = new FileOutputStream("c:/bbb/lee2.jpg");

		while (true) {
			int read1 = fis1.read();
			if (read1 == -1) break;
			fos1.write(read1);

		} // while

		fis1.close();
		fos1.close();
		System.out.println("lee1 파일이 복사되었습니다.");

		while (true) {
			int read2 = fis2.read();
			if (read2 == -1) break;
			fos2.write(read2);
		}

		fis2.close();
		fos2.close();
		System.out.println("lee2 파일이 복사되었습니다.");

	}// main

}// class
