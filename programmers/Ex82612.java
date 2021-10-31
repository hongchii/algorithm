package programmers;

import java.util.Scanner;

public class Ex82612 {

	public static void main(String[] args) {
		// 1주차_부족한 금액 계산하기

		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		scan.close();

		int price = 3; // 놀이기구의 이용료
		int money = 20; // 가지고 있는 돈
		long result = 0; // 부족한 금액

		for (int i = 1; i <= count; i++) {
			result += (long) price * i;
		}
		if (result > money) {
			result -= money;
		} else if (result == money) {
			result = 0;
		}
		System.out.println(result);
	}

}
