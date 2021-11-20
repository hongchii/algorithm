package baekJoon01;

import java.util.Scanner;

public class Ex11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String m = sc.next();

		int tot = 0;

		for (int i = 0; i < n; i++) {
			tot += Integer.parseInt(m.substring(i, i+1));
		}
		System.out.println(tot);
	}
}
