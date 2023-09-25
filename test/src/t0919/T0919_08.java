package t0919;

import java.io.File;
import java.io.IOException;

public class T0919_08 {

	public static void main(String[] args) {
		File f = new File("c:/cba");
		f.mkdir();
		System.out.println("폴더가 생성되었습니다.");
		
		File fFile = new File("c:/cba/1.txt");
		
		try {
			fFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("프로그램을 종료합니다.");
		}
		

	}

}
