package baekJoon02;

import java.util.Scanner;

public class Ex10872 {

	public static void main(String[] args) {
		// 팩토리얼

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int f = 1;
		scan.close();
		for (int i = 1; i <= n; i++) {
			f *= i;
		}
		System.out.println(f);
	}

}
