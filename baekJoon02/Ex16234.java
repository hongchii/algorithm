package baekJoon02;

public class Ex16234 {

	public static void main(String[] args) {
		// 인구 이동
		int n = 2, l = 20, r = 50;

		int[][] arr = { { 50, 30 }, 
						{ 20, 40 } };
		
		int cnt = 1;
		int res = 0, tmp = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) { // 가로 
				tmp = arr[i][j] - arr[j][1-j]; // 0,0으로 0,1 과 1,0 비교하기
				// 0,0 . 0,1        0,1 . 1,0
				// arr[i][j] = 0,0, 0,1, 1,0, 1,1
				// 2 - 1,1로 0,1과 1,0 비교하기
				if(tmp < 0) {
					tmp = -tmp; // 음수를 양수로.
				}
				if (l <= tmp && tmp <= r) { // l <= tmp <= r
					cnt++; // 연합 칸 개수 카운트
				}
			}
		}
		res = tmp / cnt;
		System.out.println(res);
	
	}

}		
		
//		final int row = arr.length;
//		final int col = arr[0].length;
/*
		int[][] result = new int[n][n];
		int tot = 0;
		int cnt = 0;
		int day = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < result.length; k++) {
					result[i][j] += arr[i][k] - arr[k][j];
					System.out.println(result[i][j]);
					
					if (result[i][j] >= l && result[i][j] <= r) {
							tot += result[i][j];
							cnt++;
							System.out.println(tot);
							System.out.println(cnt);
					}
				}

			}
			day = tot / cnt;
		}
		*/
	//	System.out.println(day);

