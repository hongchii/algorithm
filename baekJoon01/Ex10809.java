package baekJoon01;

import java.util.Scanner;

public class Ex10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String alphabet = sc.next();

		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(alphabet.indexOf(ch) + " ");
		}
	}

}
