package code;

public class LeftRotation {
	
	public static int[] rotLeft(int[] arr, int rotations) {
		int[] result = new int[arr.length];
/*		
		for (int y = 0; y < rotations; y++) {
			for (int x = 0; x < arr.length-1; x++) {
				result[x] = arr[x+1];
			}
			result[arr.length-1] = arr[0];
			arr = result.clone();
		}
*/
		//OU
		if (arr.length == 0 || rotations == 0 || (rotations >= arr.length && rotations % arr.length==0)) 
			return arr;
		
		if (rotations >= arr.length)
			rotations = rotations % arr.length;
	
		for (int x = 0; x < arr.length; x++) {
			if (x < rotations) {
				result[arr.length-rotations+x] = arr[x];
			} else {
				result[x-rotations] = arr[x];
			}
		}
		
		return result;
	}

}
