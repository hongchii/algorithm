package baekJoon02;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10817 {

	public static void main(String[] args) {
		// 세수
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();

		Arrays.sort(arr);

		System.out.println(arr[1]);

	}

}
