package programmers;

import java.util.Scanner;

public class Level2_Ex02 {

	public static void main(String[] args) {

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
