package code;

public class BubbleSort {

	public static int[] sort(int[] arr) {
		
		int aux;
		
		for (int x = 0; x < arr.length; x++) {
			for (int y = x+1; y < arr.length; y++ ) {
				if (arr[x] > arr[y]) {
					aux = arr[x];
					arr[x] = arr[y];
					arr[y] = aux;
				}
			}
		}
		
		return arr;
	}

}
