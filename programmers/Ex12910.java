package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex12910 {

	public static void main(String[] args) {
		// 나누어 떨어지는 숫자 배열

		Scanner scan = new Scanner(System.in);
		int[] arr = { 5, 9, 7, 10 };
		int divisor = scan.nextInt();

		List<Integer> list = new ArrayList<>();

		for (int a : arr) {
			if (a % divisor == 0) {
				list.add(a);
			}
		}
		if (list.size() == 0) {
			System.out.println(new int[] { -1 });
		}

		int answer[] = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		Arrays.sort(answer);
		System.out.println(Arrays.toString(answer));
	}

}
