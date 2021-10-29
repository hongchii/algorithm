package programmers;

import java.util.Scanner;

public class Ex12918 {

	public static void main(String[] args) {
		// 문자열 다루기 기본
		boolean answer = true;

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		if (s.length() == 4 || s.length() == 6) {
			for (char ch = 'a'; ch <= 'z'; ch++) {
				int a = s.indexOf(ch);

				if (a > -1) {
					answer = false;
					break;
				} else {
					answer = true;
				}
			}

		} else {
			answer = false;
		}

		System.out.println(answer);
	}

}
