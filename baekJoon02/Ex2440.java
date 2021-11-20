package baekJoon02;

import java.util.Scanner;

public class Ex2440 {

	public static void main(String[] args) {
		// 별 찍기 - 3

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
