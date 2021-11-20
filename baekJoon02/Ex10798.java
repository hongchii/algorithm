package baekJoon02;

import java.util.Scanner;

public class Ex10798 {

	public static void main(String[] args) {
		// 세로읽기
		
		Scanner scan = new Scanner(System.in);

		char ch[][] = new char[5][15];
		int max = Integer.MAX_VALUE;

		for (int i = 0; i < 5; i++) { // 5번의 입력
			String s = scan.nextLine().trim();
			max = Math.max(max, s.length());

			for (int j = 0; j < s.length(); j++) {
				ch[i][j] = s.charAt(j);
			}
		}

		for (int i = 0; i < max; i++) {
			for (int j = 0; j < 5; j++) {
				if (ch[i][j] == '\0')
					continue;

				System.out.print(ch[i][j]);
			}
		}
	}

}
