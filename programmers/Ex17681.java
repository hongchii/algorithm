package programmers;

public class Ex17681 {

	public static void main(String[] args) {
		// [1차] 비밀지도
		// n과 arr1 , arr2가 입력됨.
		// arr1, arr2 들어온 값을 이진수로 변환. "" 0, # 1

		int n = 5;

		int arr1[] = { 9, 20, 28, 18, 11 };
		int arr2[] = { 30, 1, 21, 17, 28 };

		String answer[] = new String[n];
		// 배열에 담긴 10진수를 2진수로 변환.
		for (int i = 0; i < n; i++) {
			answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]); // 0진수를 2진수로 변환. | 비트연산자. 한 쪽의 값이 1이면 1을 결과로 얻는다.
		}

		for (int i = 0; i < n; i++) {
			answer[i] = String.format("%" + n + "s", answer[i]);
			answer[i] = answer[i].replace("1", "#"); // 1이면 #(벽)으로
			answer[i] = answer[i].replace("0", ""); // 0이면 " "(공백)으로
		}
		// System.out.println(answer);
	}

}
