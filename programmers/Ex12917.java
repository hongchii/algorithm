package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex12917 {

	public static void main(String[] args) {
		// 문자열 내림차순으로 배치하기
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		String answer = "";
		String str[] = s.split("");
		Arrays.sort(str, Collections.reverseOrder());

		for (int i = 0; i < str.length; i++) {
			answer += str[i];
		}
		System.out.print(answer);

	}

}
