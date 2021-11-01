package programmers;

import java.util.Arrays;

public class Ex42748 {

	public static void main(String[] args) {
		// K번째수

		int arr[] = { 1, 5, 2, 6, 3, 7, 4 };
		int commands[][] = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } }; // i번째 ~ j번째 , k번째수

		int answer[] = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int result[] = Arrays.copyOfRange(arr, commands[i][0] - 1, commands[i][1]); // 배열이름, 시작인덱스 , 끝인덱스
			Arrays.sort(result);
			answer[i] = result[commands[i][2] - 1];
		}

		System.out.println(Arrays.toString(answer));
	}

}
