package simplePattrens;

public class RightSideHallowTriangle {

	public static void main(String[] args) {
		int n = 10;
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n; j++) {
				//printing diagnol,lastrow, and last column
				if (i == (n - (n - 1)) || (i == j) || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
