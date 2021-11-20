package baekJoon01;

import java.util.Scanner;

public class Ex1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = n;
		int count = 0;

		while (true) {
			n = ((n % 10) * 10) + ((n / 10 + n % 10) % 10);
			count++;

			if (m == n) {
				break;
			}
		}
		System.out.println(count);
	}

}
