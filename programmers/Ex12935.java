package programmers;

import java.util.Arrays;
import java.util.Scanner;

public class Ex12935 {

	public static void main(String[] args) {
		// 제일 작은 수 제거하기
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		if (arr.length == 1) {
			System.out.println(new int[] { -1 });
		}

		int minindex = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[minindex] > arr[i]) {
				minindex = i;
			}
		}
		int answer[] = new int[arr.length - 1];
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (minindex == i) {
				continue;
			}
			answer[cnt++] = arr[i];
		}
		System.out.println(Arrays.toString(answer));
	}

}
