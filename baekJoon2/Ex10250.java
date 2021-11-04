package baekJoon2;

import java.util.Scanner;

public class Ex10250 {

	public static void main(String[] args) {
		// ACM 호텔
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		// int h = 6, w = 12, n = 10; // 층수, 각층의 방, 몇번째 손님인지
		int h, w, n;
		for (int i = 0; i < t; i++) {
			h = scan.nextInt();
			w = scan.nextInt();
			n = scan.nextInt();

			int x, y;
			int result = 0;
			if (n % h == 0) {
				y = h * 100;
				x = n / h;
				result = x + y;
			} else {
				y = (n % h) * 100;
				x = (n / h) + 1;
				result = x + y;
			}

			System.out.println(result);
		}
		scan.close();
	}

}
