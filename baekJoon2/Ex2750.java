package baekJoon2;

import java.util.*;

public class Ex2750 {

	public static void main(String[] args) {
		// 수 정렬하기
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int[] su = new int[n];

		for (int i = 0; i < su.length; i++) {
			su[i] = scan.nextInt();
		}
		scan.close();

		Arrays.sort(su);

		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}

	}

}
