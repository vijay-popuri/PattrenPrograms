package simplePattrens;

public class Patt56 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			int p=i;
			int k=n-1;
			for(int j=1;j<=i;j++) {
				System.out.print(p+" ");
				p+=k;
				k++;
			}
			System.out.println();
		}
	}
}
