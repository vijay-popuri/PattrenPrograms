package simplePattrens;

public class Patt43 {
	public static void main(String[] args) {

		int n = 5;
		for (int i = 0; i < n; i++) {
			int k = 2 * i + 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(k + " ");
				k += 2;
			}
			System.out.println();
		}
	}

}
