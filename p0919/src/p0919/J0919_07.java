package p0919;

import java.io.File;
import java.io.IOException;

public class J0919_07 {

	//1.main 메소드
	public static void main(String[] args) {
		String aName = "";
		File f= createFile(aName); //createFile메소드 호출
		

	}//main

	//2. createFile 메소드
//	static File createFile(String fileName) {
//		try {
//			if(fileName == null || fileName.equals("")) {
//				throw new Exception("파일이름이 유효하지 않습니다.");
//			}
//		} catch (Exception e) {
//			fileName = "c:/aaa/제목없음.txt";
//			e.getMessage();
//		} finally {
//			File f = new File(fileName);
//			try {
//				f.createNewFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println("파일이 생성되었습니다.");
//			return f;
//		}
//	}//createFile
	
	static File createFile(String fileName) {
		if(fileName==null || fileName=="") {
			fileName = "c:/aaa/제목없음.txt";
		}
		File f = new File(fileName);
		try {
			f.createNewFile();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(fileName+"파일생성이 되었습니다.");
		return f;
		
	}
	
	
	
}//class
