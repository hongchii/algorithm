package baekJoon01;

import java.util.Scanner;

public class Ex2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a = 1;
		int b = 6;

		int tmp = 0;

		while (true) {
			if (a <= n) {
				System.out.println();
				break;
			} else {
				a++;
				tmp += b;
			}
			System.out.println(tmp);
		}
	}

}
