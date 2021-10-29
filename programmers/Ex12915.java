package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex12915 {

	public static void main(String[] args) {
		// 문자열 내 마음대로 정렬하기

		String strings[] = { "car", "bed", "sun" };
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		String[] answer = {};
		ArrayList<String> arr = new ArrayList<>();
		for (int i = 0; i < strings.length; i++) {
			arr.add("" + strings[i].charAt(n) + strings[i]);
		}
		Collections.sort(arr);
		answer = new String[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			answer[i] = arr.get(i).substring(1, arr.get(i).length());
		}

		System.out.println(Arrays.toString(answer));

	}

}
