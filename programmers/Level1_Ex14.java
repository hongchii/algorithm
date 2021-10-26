package programmers;

import java.util.Arrays;

public class Level1_Ex14 {

	public static void main(String[] args) {
		// 자연수 뒤집어 배열로 만들기

		long n = 12345;
		String str = String.valueOf(n);

		int arr[] = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[str.length() - i - 1] = Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		System.out.println(Arrays.toString(arr));
	}

}
