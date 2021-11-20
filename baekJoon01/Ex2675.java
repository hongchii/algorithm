package baekJoon01;

import java.util.Scanner;

public class Ex2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int r1 = sc.nextInt();
			String r2 = sc.next();

			for (int j = 0; j < r2.length(); j++) {
				for (int k = 0; k < r1; k++) {
					System.out.print(r2.charAt(j));
				}
			}
			System.out.println();
		}

	}

}
