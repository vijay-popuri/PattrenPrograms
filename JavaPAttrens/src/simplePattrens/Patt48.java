package simplePattrens;

public class Patt48 {

	public static void main(String[] args) {
		int n = 5;
		int k = 1;
		int x = k;
		for (int i = n; i >= 1; i--) {
			int p = i;
			x = k;
			for (int j = n; j >= i; j--) {
				System.out.print(x + " ");
				x -= p;
				p++;
			}
			k += i;
			System.out.println();
		}

	}

}