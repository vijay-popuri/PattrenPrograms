package simplePattrens;

public class Patt44 {

	public static void main(String[] args) {
		int k = 0, n = 4;
		for (int i = 1; i <= n; i++) {
			k += i;
			for (int j = k; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
