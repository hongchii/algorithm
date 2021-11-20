package baekJoon02;

import java.util.Scanner;

public class Ex2980 {

	public static void main(String[] args) {
		// 도로와 신호등

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt(); // 신호등의 개수
		int l = scan.nextInt(); // 도로의 길이
		int cnt = 0;
		int pre = 0;

		for (int i = 0; i < n; i++) {
			int d = scan.nextInt(); // 신호등의 위치
			int r = scan.nextInt(); // 빨간불 (멈추는 시간)
			int g = scan.nextInt(); // 초록불 (가는 시간)
			cnt += d - pre; // 3-0, cnt = 3
			pre = d; // 3

			int red = cnt % (r + g); // 3 % (5+5) 3을 10으로 나눈 나머지 red = 3
			if (red <= r) { // 3 <= r(5)
				cnt += r - red; // cnt += r - red 5 - 3 cnt(3)+ 2 = 5
			}
		}
		System.out.println(cnt + (l - pre));

	}

}
