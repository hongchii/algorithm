package programmers;

import java.util.Scanner;

public class Ex12922 {

	public static void main(String[] args) {
		// 수박수박수박수박수박수?

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String answer = "";

		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				answer += "수";
			} else {
				answer += "박";
			}
		}
		System.out.println(answer);
	}

}
