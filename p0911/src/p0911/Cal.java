package p0911;

public class Cal {
	
	int num1;
	int num2;
	int addResult;
	int subResult;
	int multiResult;
	double divResult;
	
	int add(int[] n) {
		int result = n[0];
		for (int i=1;i<n.length;i++) {
			result = result + n[i];
		}
		return result;
	}
	
	int sub(int[] n) {
		int result = n[0];
		for (int i=1;i<n.length;i++) {
			result = result - n[i];
		}
		return result;
	}
	
	int mul(int[] n) {
		int result = n[0];
		for (int i=1;i<n.length;i++) {
			result = result * n[i];
		}
		return result;
	}
	
	int div(int[] n) {
		int result = n[0];
		for (int i=1;i<n.length;i++) {
			result = result/n[i];
		}
		return result;
	}

}
