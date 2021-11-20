package baekJoon01;

import java.util.Scanner;

public class Ex3052 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt() % 42;
		}
		sc.close();

		for (int i = 0; i < arr.length; i++) {
			int tmp = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					tmp++;
				}
			}
			if (tmp == 0) {
				count++;
			}

		}
		System.out.println(count);

	}

}
