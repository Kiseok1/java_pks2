package test;

public class StuScore {
	StuScore (){}
	
	StuScore (int stuNo, String name, int kor, int eng, int math){
		this.stuNo=stuNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = this.kor+this.eng+this.math;
		this.avg = this.total/3.0;
	}
	
	int stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;

}
