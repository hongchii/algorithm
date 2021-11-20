package baekJoon02;

import java.util.Scanner;

public class Ex2941 {

	public static void main(String[] args) {
		// 크로아티아 알파벳

		String str[] = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		for (int i = 0; i < str.length; i++) {

			if (s.contains(str[i])) { // s에 입력된 문자 중 str문자열이 포함되어 있는지 검사.
				s = s.replace(str[i], "1"); // 있으면 해당 문자를 다른 하나의 문자로 바꿔줌.
			}

		}
		System.out.println(s.length()); // 문자열의 길이를 출력.

	}

}
