package programmers;

import java.util.Scanner;

public class Ex12928 {

	public static void main(String[] args) {
		// 약수의 합
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
