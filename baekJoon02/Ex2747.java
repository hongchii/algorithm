package baekJoon02;

import java.util.Scanner;

public class Ex2747 {

	public static void main(String[] args) {
		// 피보나치 수

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = 0, b = 1, c = 0;

		if (n == 1) {
			System.out.println(1);
		} else {
			for (int i = 1; i < n; i++) {
				c = a + b;
				a = b;
				b = c;

			}
			System.out.println(c);
		}
	}

}
