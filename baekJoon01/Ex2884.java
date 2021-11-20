package baekJoon01;

import java.util.Scanner;

public class Ex2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();

		if (m < 45) {
			h = h - 1;
			m = m + 60 - 45;
			if (h < 0) {
				h = 23;
				System.out.println( h + " " + m);
			} else {
				System.out.println( h + " " + m);
			}
		} else {
			m = m - 45;
			System.out.println( h + " " + m);
		}
	}
}
