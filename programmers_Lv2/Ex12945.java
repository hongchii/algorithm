package programmers_Lv2;

public class Ex12945 {

	public static void main(String[] args) {
		// 피보나치 수
		int n = 3;
		int[] answer = new int[n + 1];
		// 피보나치 수 f(n) = f(n-1)+f(n-2)
		answer[0] = 0;
		answer[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			answer[i] = (answer[i-1] + answer[i-2]) % 1234567;
		}
		
		System.out.println(answer[n]);
	}

}
