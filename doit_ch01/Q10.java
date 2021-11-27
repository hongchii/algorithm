package doit_ch01;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("a의 값 : ");
		int a = scan.nextInt();
		int b;
		do {
			System.out.print("b의 값 : ");
			b = scan.nextInt();

			if (a == b) {
				System.out.println("a보다 큰 값을 입력하세요!");
			}

		} while (a >= b);

		int answer = b - a;
		System.out.print("b - a는 " + answer + "입니다.");
	}

}
