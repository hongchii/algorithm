package baekJoon2;

public class Ex4673 {

	public static void main(String[] args) {

		boolean[] selfNumber = new boolean[10001];

		for (int i = 1; i < 10001; i++) {
			int n = d(i);

			if (n < 10001) {
				selfNumber[n] = true;

			}
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < 10001; i++) {
			if (!selfNumber[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}

	public static int d(int number) {
		int sum = number;

		while (number != 0) {
			sum = sum + (number % 10); // 첫번째 자리수
			number = number / 10; // 10을 나누어 제일 끝 자리를 없앤다.
		}

		return sum;
	}

}
