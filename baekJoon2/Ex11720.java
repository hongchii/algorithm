package baekJoon2;

import java.util.Scanner;

public class Ex11720 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		int total = 0;
		String str = scan.next();

		for (int i = 0; i < t; i++) {
			total += Integer.parseInt(str.substring(i, i + 1));
		}
		scan.close();
		System.out.println(total);

	}
}
