package simplePattrens;

public class Patt52 {
	public static void main(String[] args) {
		int n = 5;
		int sum = 0, k;
		for (int i = n; i >= 1; i--) {
			sum += i;
			k = sum;
			int var = i;
			for (int j = i; j <= n; j++) {
				System.out.print(k + " ");
				k-=(var+1);
				var++;
			}
			System.out.println();
		}
	}

}
