package baekJoon02;

import java.util.Scanner;

public class Ex2675 {

	public static void main(String[] args) {
		/* 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 
		새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 
		즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다.
		*/
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt(); // 테스트 케이스 입력받기.

		for (int i = 0; i < t; i++) {
			int r = scan.nextInt(); // 반복 할 횟수
			String s = scan.next(); // 반복 할 문자열

			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < r; k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}

	}

}
