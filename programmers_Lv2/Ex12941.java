package programmers_Lv2;

import java.util.Arrays;

public class Ex12941 {

	public static void main(String[] args) {
		// 최솟값 만들기
		int[] a = { 1, 4, 2 };
		int[] b = { 5, 4, 4 };
		int answer = 0;

		Arrays.sort(a); // 오름차순 정렬
		Arrays.sort(b);

		for (int i = 1; i <= a.length; i++) {
			answer += a[i - 1] * b[b.length - i];
		}
		System.out.println(answer);
	}

}
