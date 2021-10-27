package programmers;

import java.util.Scanner;

public class Ex12969 {

	public static void main(String[] args) {
		// 직사각형 별찍기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}