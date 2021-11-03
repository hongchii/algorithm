package baekJoon2;

import java.util.Scanner;

public class Ex2441 {

	public static void main(String[] args) {
		// 별 찍기 -4

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		for (int i = 0; i < n; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}

			for (int j = n - i; j > 0; j--) { // j = 5 - 0, 4 - 1
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
