package programmers;

import java.util.Arrays;
import java.util.Scanner;

public class Level1_Ex11 {

	public static void main(String[] args) {
		// 정수 내림차순으로 배치하기
		
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		int tmp = 0;
		String num = String.valueOf(n);
		String ansnum = "";
		char[] arr = new char[num.length()];
		for (int i = 0; i < num.length(); i++) {
			arr[i] += num.charAt(i);
		}
		Arrays.sort(arr);
		for (int i = arr.length - 1; i >= 0; i--) {
			ansnum += arr[i];
		}
		long answer = Long.parseLong(ansnum);
		//return answer;
		System.out.println(answer);
	}

}
