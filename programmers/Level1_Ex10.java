package programmers;

import java.util.Scanner;

public class Level1_Ex10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int answer = 0;

		while (true) {
			int a = n / 10;
			int b = n % 10;
			answer += b;
			
			if (a < 10) {
				answer += a;
				break;
			} else {
				n = a;
			}
		}

		System.out.println(answer);
	}

}
