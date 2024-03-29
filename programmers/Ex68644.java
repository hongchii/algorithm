package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex68644 {

	public static void main(String[] args) {
		// 두 개 뽑아서 더하기

		int[] numbers = { 2, 1, 3, 4, 1 };
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int a = numbers[i] + numbers[j];
				if (list.indexOf(a) < 0) {
					list.add(a);
				}
			}
		}

		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		Arrays.sort(answer);

		System.out.println(Arrays.toString(answer));
	}

}
