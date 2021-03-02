package BaekJoon;

import java.util.Scanner;

public class Ex2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		int result = a * b * c;
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int tmp = result;

			while (tmp != 0) {
				if (tmp % 10 == arr[i]) {
					count++;
				}

				tmp /= 10;
			}
			System.out.println(count);
		}

	}

}
