package programmers_Lv2;

import java.util.Arrays;

public class Ex12949 {

	public static void main(String[] args) {
		// 행렬의 곱셈
		int[][] arr1 = { { 1, 4 }, { 3, 2 }, { 4, 1 } };
		int[][] arr2 = { { 3, 3 }, { 3, 3 } };

		final int ROW = arr1.length;
		final int COL = arr2[0].length;
		final int ARR2_ROW = arr2.length;
		int[][] answer = new int[ROW][COL];

		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				for (int k = 0; k < ARR2_ROW; k++) {
					answer[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
		System.out.println(Arrays.deepToString(answer));
	}

}
