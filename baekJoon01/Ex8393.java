package baekJoon01;

import java.util.Scanner;

public class Ex8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 0;

		for (int i = 1; i <= n; i++) {
			m += i;
		}
		System.out.println(m);
	}

}
