package code;

import java.util.ArrayList;
import java.util.List;

public class BuzzFizzImpl {

	public static List<String> range(int init, int end) {

		List<String> listRange = new ArrayList<>();
		
		String last = null;

		for (; init <= end; init++) {
			String result;
			
			if ((init % 3 == 0 || String.valueOf(init).contains("3"))
					&& (init % 5 == 0 || String.valueOf(init).contains("5"))) {
				result = "FIZZBUZZ";
			} else if (init % 3 == 0 || String.valueOf(init).contains("3")) {
				result = "FIZZ";
			} else if (init % 5 == 0 || String.valueOf(init).contains("5")) {
				result = "BUZZ";
			} else {
				result = String.valueOf(init);
			}
			
			if (last!=null && result.equals(last)) {
				listRange.add("=");
			} else {
				last = result;
				listRange.add(result);
			}
		}
		return listRange;
	}

}
