package programmers;

public class Level1_Ex08 {

	public static void main(String[] args) {

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
