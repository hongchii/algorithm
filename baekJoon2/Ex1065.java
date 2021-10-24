package baekJoon2;

import java.util.Scanner;

public class Ex1065 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int res = result(n);

		System.out.println(res);

	}

	public static int result(int n) {
		int res = 0;

		if (n < 100) {
			res = n;

		} else if (n == 1000) {
			res = 144;

		} else if (n < 1000) {
			res = 99;
			for (int i = 100; i <= n; i++) {
				int a = i / 100;
				int b = ((i - (a * 100)) / 10);
				int c = (i % 10);
				if ((a - b) == (b - c) || (b - a) == (c - b)) {
					res++;
				}
			}

		}
		return res;
	}
}
