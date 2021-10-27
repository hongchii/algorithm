package programmers;

import java.util.Scanner;

public class Ex12954 {

	public static void main(String[] args) {
		// x만큼 간격이 있는 n개의 숫자
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int n = scan.nextInt();
		long tmp = 0;
		long[] answer = new long[n];

		for (int i = 0; i < answer.length; i++) {
			tmp += x;
			answer[i] = tmp;
			System.out.print(answer[i]);
		}
	}

}
