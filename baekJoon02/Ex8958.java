package baekJoon02;

import java.util.Scanner;

public class Ex8958 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		String str = "";

		for (int i = 0; i < t; i++) {
			str = scan.next();
			int score = 0;
			int cnt = 0;

			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == 'O') {
					cnt++;
					score += cnt;

				} else {
					cnt = 0;
				}
			}
			System.out.println(score);

		}

	}

}
