package programmers_Lv2;

public class Ex12924 {

	public static void main(String[] args) {
		// 숫자의 표현
		int n = 15;
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			int tmp = 0;
			for (int j = i; j <= n; j++) {
				tmp += j;
				if (tmp == n) {
					answer++;
					break;
				} else if (tmp > n) {
					break;
				}
			}
		}
		System.out.println(answer);
	}

}
