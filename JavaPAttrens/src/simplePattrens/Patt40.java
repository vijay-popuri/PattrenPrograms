package simplePattrens;

public class Patt40 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++){
			int k=2;
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k+=2;
			}
			System.out.println();
		}
	}

}
