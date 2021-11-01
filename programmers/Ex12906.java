package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex12906 {

	public static void main(String[] args) {
		// 같은 숫자는 싫어
		int arr[] = { 1, 1, 3, 3, 0, 1, 1 };

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] == arr[i]) {
				arr[i - 1] = -1;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != -1) {
				list.add(arr[i]);
			}
		}
		
		int answer[] = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		System.out.println(Arrays.toString(answer));

	}

}
