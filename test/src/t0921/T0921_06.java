package t0921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class T0921_06 {

	public static void main(String[] args) throws Exception {
		// stu1.txt파일의 내용을 list에 담기
		ArrayList list = new ArrayList();
		FileReader fr = new FileReader("c:/aaa/stu1.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine();
			if(line==null) break;
			String[] arrData = line.split(",");
			int stuNum = Integer.parseInt(arrData[0]);
			String name = arrData[1];
			int kor = Integer.parseInt(arrData[2]);
			int eng = Integer.parseInt(arrData[3]);
			int math = Integer.parseInt(arrData[4]);
			int total = Integer.parseInt(arrData[5]);
			double avg = Double.parseDouble(arrData[6]);
			int rank = Integer.parseInt(arrData[7]);
			list.add(new StuScore(stuNum,name,kor,eng,math,total,avg,rank));
		}
		
		

	}

}
