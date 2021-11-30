package doit_ch01;

import java.util.Scanner;

public class Q15_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력합니다.");
		System.out.print("입력 : ");
		int n = scan.nextInt();

		triangleLU(n);

	}

	static void triangleLU(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
