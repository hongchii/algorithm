package doit_ch01;

import java.util.Scanner;

public class Q15_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력합니다.");
		System.out.print("입력 : ");
		int n = scan.nextInt();

		triangleRU(n);

	}

	static void triangleRU(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
