package LeetcodeProgs;

import java.util.ArrayList;
import java.util.List;

public class ZigZagPattren {

	public List<Integer> getTheZigZagEles(int a[][]) {
		List<Integer> list = new ArrayList<>();
		boolean leftToRight = true;
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
			for (int j = 0; j < a[i].length; j++) {
				if (leftToRight) {
					list.add(a[i][j]);
					}
				leftToRight = !leftToRight;
			}
		} else {
				for (int j = a[i].length - 1; j >= 0; j--) {
					if (leftToRight) {
						list.add(a[i][j]);
					}
					leftToRight = !leftToRight;

				}

			}

		}

		return list;
	}

//output{1,3,8,6,9,11,16,14}
//1 3 6
	public static void main(String[] args) {
		int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		ZigZagPattren obj = new ZigZagPattren();

		List<Integer> zigZagEles = obj.getTheZigZagEles(grid);
		System.out.println(zigZagEles);
	}

}
