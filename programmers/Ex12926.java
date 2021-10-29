package programmers;

import java.util.Scanner;

public class Ex12926 {

	public static void main(String[] args) {
		// 시저암호
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int n = scan.nextInt();

		String answer = "";
		char c;
		for (int i = 0; i < s.length(); i++) {
			c = (char) s.charAt(i);
			if (c >= 'a' && c <= 'z') {
				c = (char) (c + n);
				if (c > 'z') {
					c -= 26;
				}
			}
			if (c >= 'A' && c <= 'Z') {
				c = (char) (c + n);
				if (c > 'Z') {
					c -= 26;
				}
			}

			answer += String.valueOf(c);
		}
		System.out.print(answer);

	}
}
