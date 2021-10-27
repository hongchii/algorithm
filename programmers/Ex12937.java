package programmers;

public class Ex12937 {

	public static void main(String[] args) {
		// 짝수와 홀수
	}

	public String solution(int num) {
		String answer = "";

		if (num % 2 == 0) {
			answer = "Even";
		} else {
			answer = "Odd";
		}
		return answer;
	}
}
