package code;

import java.util.ArrayList;
import java.util.List;

public class XmasTree {

//	public static void main(String[] args) {
//		printTree(3);
//	}
	
	public static Integer[] xmastree(int x) {
		List<Integer[]> values = buildTree(new ArrayList<Integer[]>(), 1, 1, x);
		return values.get(x-1);
	}

	private static List<Integer[]> buildTree(List<Integer[]> list, int nextValue, int line, int treeSize) {
		
		Integer[] values = new Integer[line];
		
		for (int x = 0; x < treeSize-line; x++) {
			System.out.print("   ");
		}
		for (int x = 0; x < line; x++) {
			values[x] = nextValue;
			System.out.print(nextValue+"    ");
			nextValue+=2;
		}
		System.out.println();
		list.add(values);
		if (line == treeSize) {
			return list;
		} else {
			return buildTree(list, nextValue, line+1, treeSize);
		}
	}

}
