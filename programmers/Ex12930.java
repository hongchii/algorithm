package programmers;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex12930 {

	public static void main(String[] args) {
		// 이상한 문자 만들기
		Scanner scan = new Scanner(System.in);
		String answer = "";
		String str = scan.nextLine();
		int cnt = 0;
		String[] array = str.split("");

		for (String st : array) {
			cnt = st.contains(" ") ? 0 : cnt + 1;
			answer += cnt % 2 == 0 ? st.toLowerCase() : st.toUpperCase();
		}
		// return answer;
		System.out.println(answer);
	}

}
