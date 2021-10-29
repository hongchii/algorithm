package programmers;

import java.util.Scanner;

public class Ex12916 {

	public static void main(String[] args) {
		// 문자열 내 p와 y의 개수
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		boolean answer = true;
		String str[] = s.split("");
		int p = 0;
		int y = 0;

		for (int i = 0; i < str.length; i++) {
			if (str[i].equalsIgnoreCase("p")) {
				p++;
			}
			if (str[i].equalsIgnoreCase("y")) {
				y++;
			}
		}

		answer = (p == y) ? true : false;

	}

}
