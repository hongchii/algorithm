package baekJoon01;

import java.util.Scanner;

public class Ex1712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		// long cnt = 0;
		if (c <= b) {
			System.out.println("-1");
		} else {
			// cnt = (a / (c - b)) + 1;
			// System.out.println(cnt);
			System.out.println(a / (c - b) + 1);
		}

	}

}
