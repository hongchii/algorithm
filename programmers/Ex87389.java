package programmers;

import java.util.Scanner;

public class Ex87389 {

	public static void main(String[] args) {
		// 나머지가 1이 되는 수 찾기

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 1;
		int answer = 0;
		while (n >= i) {
			if (n % i == 1) {
				answer = i;
				break;
			}
			i++;
		}
		System.out.println(answer);
	}

}
