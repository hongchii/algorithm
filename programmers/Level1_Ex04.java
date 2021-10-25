package programmers;

public class Level1_Ex04 {

	public static void main(String[] args) {

	}

	public boolean solution(int x) {
		boolean answer = false;
		int total = 0;
		int n = x;

		for (int i = 0; i < 4; i++) {
			int a = x % 10;
			int b = x / 10;
			total += a;

			if (b < 10) {
				total += b;
				break;

			} else {
				x = b;
			}
		}

		if (n % total == 0) {
			answer = true;
			return answer;
		} else {
			answer = false;
			return answer;
		}
	}
}
