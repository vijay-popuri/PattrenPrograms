package simplePattrens;

public class Patt51 {

	public static void main(String[] args) {
		int n = 5;
		int x = (n) * (n + 1) / 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%-4d", x);
				x--;
			}
			System.out.println();
		}
	}

}
