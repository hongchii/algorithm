package programmers;

public class Ex12944 {

	public static void main(String[] args) {
		// 평균 구하기
	}

	public double solution(int[] arr) {
		double answer = 0;
		int[] arr1 = arr;
		int total = 0;
		for (int i = 0; i < arr1.length; i++) {
			total += arr1[i];
		}
		answer = (double) total / arr1.length;

		return answer;
	}
}
