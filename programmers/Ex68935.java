package programmers;

public class Ex68935 {

	public static void main(String[] args) {
		// 3진법 뒤집기
		// 10진수 -> n진수로 변환하는 법 10진수를 n으로 나눠준다.

		int n = 45;
		String answer = "";

		while (n >= 3) {
			answer += n % 3;
			n /= 3;
		}
		answer += n;
		System.out.println(answer);

		System.out.println(Integer.parseInt(answer, 3));
		// Integer.parseInt(s, radix) 숫자형 문자열 s를 radix => 해당 진수로 바꿔줌
	}

}
