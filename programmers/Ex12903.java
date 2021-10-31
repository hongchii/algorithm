package programmers;

import java.util.Scanner;

public class Ex12903 {

	public static void main(String[] args) {
		// 가운데 글자 가져오기

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String answer = "";
		// index 0,1,2,3....

		if (s.length() % 2 == 0) {
			answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
			System.out.println(s.length() / 2 - 1); // == 1 start
			System.out.println(s.length() / 2 + 1); // == 2 end
		} else {
			answer = s.substring(s.length() / 2, s.length() / 2 + 1);
		}

		System.out.println(answer);
	}

}
