package programmers_Lv2;

public class Ex12953 {

	public static void main(String[] args) {
		// N개의 최소공배수
		int[] arr = { 2, 6, 8, 14 };

		int answer = arr[0];

		for (int i = 1; i < arr.length; i++) {
			int gcd = gcd(answer, arr[i]); // 최대공약수
			answer = answer * arr[i] / gcd; // 최소공배수
		}
		System.out.println(answer);
	}

	public static int gcd(int a, int b) {
		// 최대공약수를 구하는 유클리드 호제법
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}

		return a;
	}
}
