package code;

public class Fibornacci {

	public static int fib(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			int result = 1;
			int before = 1;
			int aux;
			for (int x = 3; x<= n; x++) {
				aux = result;
				result = result + before;
				before = aux;
			}
			return result;
			//return fibRec(n, 2, 1, 1);
		}
		
		
	}

/*
	static int fibRec(int index, int lastIndex, int lastValue, int beforeValue) {
		
		int x = lastValue + beforeValue;
		
		if (index == (lastIndex+1)) {
			return x;
		} else {
			return fibRec(index, lastIndex+1, beforeValue, x);
		}
	}
*/
}
