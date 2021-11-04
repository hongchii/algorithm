package programmers_Lv2;

import java.util.Scanner;

public class Ex12899 {

	public static void main(String[] args) {
		// 124 나라의 숫자
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		// int n = 3;

		String answer = "";
		String[] str = { "4", "1", "2" };

		while (0 < n) {
			answer = str[n % str.length] + answer;
			n = (n - 1) / 3;
		}

		System.out.println(answer);

	}

}
