package baekJoon02;

import java.util.Scanner;

public class Ex2490 {

	public static void main(String[] args) {
		// 윷놀이
		/*
		 * 도는 A, 개는 B, 걸은 C, 윷은 D, 모는 E로 배(0)와 등(1)
		 */

		Scanner scan = new Scanner(System.in);

		int result[] = new int[4];
		int cnt = 0;

		for (int i = 0; i < 3; i++) { // 총 3번
			for (int j = 0; j < result.length; j++) {
				result[j] = scan.nextInt(); // 윷 던지기

				if (result[j] == 1) { // 1(등)이면
					cnt++;
				}

			}
			switch (cnt) {
			case 0:
				System.out.println("D"); // 모
				break;
			case 1:
				System.out.println("C"); // 걸
				break;
			case 2:
				System.out.println("B"); // 개
				break;
			case 3:
				System.out.println("A"); // 도
				break;
			case 4:
				System.out.println("E"); // 윷
				break;
			}
			cnt = 0; // 초기화
		}
	}

}
