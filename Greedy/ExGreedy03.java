package greedy;

import java.util.Scanner;

public class ExGreedy03 {

	public static void main(String[] args) {
		// 이것이 코딩테스트다 p96 숫자 카드 게임

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int result = 0;

		for (int i = 0; i < n; i++) {

			int min = 10001;
			for (int j = 0; j < m; j++) {
				int x = sc.nextInt();
				min = Math.min(min, x);
			}
		
			result = Math.max(result, min);
		}

		System.out.println(result); 
	}

}
