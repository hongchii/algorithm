package programmers;

public class Ex77884 {

	public static void main(String[] args) {
		// 약수의 개수와 덧셈

		int left = 13, right = 17;
		int answer = 0;

		for (int i = left; i <= right; i++) { // left~right까지
			int cnt = 0; // 약수 카운트

			for (int j = 1; j <= i; j++) { // 약수찾기

				if (i % j == 0) {
					cnt++;
				}

			}

			if (cnt % 2 == 0) {
				answer += i;
			} else {
				answer -= i;
			}

		}
		System.out.println(answer);
	}

}
