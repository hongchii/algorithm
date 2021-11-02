package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex42840 {

	public static void main(String[] args) {
		// 모의고사
		int[] su1 = { 1, 2, 3, 4, 5 };
		int[] su2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] su3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int[] arr = new int[3];
		int[] answers = { 1, 2, 3, 4 };

		for (int i = 0; i < answers.length; i++) {
			if (su1[i % su1.length] == answers[i]) {
				arr[0]++;
			}
			if (su2[i % su2.length] == answers[i]) {
				arr[1]++;
			}
			if (su3[i % su3.length] == answers[i]) {
				arr[2]++;
			}
		}

		int maxValue = Math.max(Math.max(arr[0], arr[1]), arr[2]);
		ArrayList<Integer> list = new ArrayList<>();

		if (maxValue == arr[0])
			list.add(1);
		if (maxValue == arr[1])
			list.add(2);
		if (maxValue == arr[2])
			list.add(3);

		int[] answer = new int[list.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}

		System.out.println(Arrays.toString(answer));
	}

}
