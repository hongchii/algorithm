package baekJoon2;

import java.util.Scanner;

public class Ex2007 {

	public static void main(String[] args) {
		// 2007년

		String[] day = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		int[] date = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt(); // x월
		int y = scan.nextInt(); // y일
		scan.close();

		int a = y;

		for (int i = 1; i < x; i++) {
			a += date[i - 1];
		}

		System.out.println(day[a % 7]);

	}

}
