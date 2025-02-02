package simplePattrens;

public class Patt54 {

	public static void main(String[] args) {
		int n = 5, num = 1;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(num - i + " ");
				num++;
			}
			System.out.println();
		}

	}

}
//1 
//1 2 
//2 3 4 
//4 5 6 7 
//7 8 9 10 11 
