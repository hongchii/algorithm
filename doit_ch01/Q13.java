package doit_ch01;

public class Q13 {

	public static void main(String[] args) {
		System.out.print(" |");
		for (int i = 1; i <= 9; i++) {
			System.out.print(" " + i);
		}
		System.out.println();
		System.out.print("-+-------------------");

		for (int i = 1; i <= 9; i++) {
			System.out.print("\n" + i + "|");
			for (int j = 1; j <= 9; j++) {
				int sum = i + j;
				System.out.print(" " + sum);
			}
			System.out.println();
		}
	}

}
