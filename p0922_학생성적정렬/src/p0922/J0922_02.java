package p0922;

public class J0922_02 {

	public static void main(String[] args) {
		
		Week w = Week.FRIDAY; //객체선언
		String w2 = "FRIDAY";
		
		String WeekName = w.name(); // w참조변수 데이터이름을 가져옴.
		System.out.println(WeekName);
		System.out.println(w.name());
		
		System.out.println(w2);
		
		
		
//		String[] kind = {"Heart","HEART","heart","hEart"};
//		for (int i=0;i<kind.length;i++) {
//			if(kind[i].equals("Heart")) {
//				System.out.println("♥");
//			}
//		}

	}//main

}//class
