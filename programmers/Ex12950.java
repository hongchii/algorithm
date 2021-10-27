package programmers;

public class Ex12950 {

	public static void main(String[] args) {
		// 행렬의 덧셈
	}
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		
		int[][] answer = new int[arr1.length][arr1[0].length];
		
		for(int i=0; i < answer.length; i++){
			for(int j=0; j < answer[i].length; j++){
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		return answer;
	}
}