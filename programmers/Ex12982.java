package programmers;

import java.util.Arrays;

public class Ex12982 {

	public static void main(String[] args) {
		// 예산
		// int[] d = { 1, 3, 2, 5, 4 }; // 부서별 신청 금액
		int[] d = { 2, 2, 3, 3 }; // 부서별 신청 금액

		int budget = 10; // 예산
		int cnt = 0;
		int tmp = 0;

		Arrays.sort(d);

		for (int i = 0; i < d.length; i++) {
			tmp += d[i];
			cnt++;
			if (tmp > budget) {
				--cnt;
				break;
			}

		}
		System.out.println(cnt);
	}

}
