package programmers;

import java.util.Scanner;

public class Ex12912 {

	public static void main(String[] args) {
		// 두 정수 사이의 합
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		long answer = 0;

		if (a == b) {
			answer = a;
		} else {
			long min = (a < b) ? a : b;
			long max = (a > b) ? a : b;

			for (long i = min; i <= max; i++) {
				answer += i;
			}
		}
		System.out.println(answer);
	}

}
