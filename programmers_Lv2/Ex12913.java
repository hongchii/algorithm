package programmers_Lv2;

public class Ex12913 {

	public static void main(String[] args) {
		// 땅따먹기
		int[][] land = {
				{ 1, 2, 3, 5 },
				{ 5, 6, 7, 8 },
				{ 4, 3, 2, 1 }
		};
		
		int answer = 0; // 점수
		int len = land.length;
		int[][] dp = new int[len][4];

		for (int i = 0; i < 4; i++) {
			dp[0][i] = land[0][i];
		}
		for (int i = 1; i < len; i++) {
			dp[i][0] = Math.max(Math.max(dp[i - 1][1], dp[i - 1][2]), dp[i - 1][3]) + land[i][0];
			dp[i][1] = Math.max(Math.max(dp[i - 1][0], dp[i - 1][2]), dp[i - 1][3]) + land[i][1];
			dp[i][2] = Math.max(Math.max(dp[i - 1][0], dp[i - 1][1]), dp[i - 1][3]) + land[i][2];
			dp[i][3] = Math.max(Math.max(dp[i - 1][0], dp[i - 1][1]), dp[i - 1][2]) + land[i][3];
		}

		answer = Math.max(Math.max(dp[len - 1][0], dp[len - 1][1]), Math.max(dp[len - 1][2], dp[len - 1][3]));
		System.out.println(answer);
	}

}
