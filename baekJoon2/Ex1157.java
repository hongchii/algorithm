package baekJoon2;

import java.util.Scanner;

public class Ex1157 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str = scan.next().toUpperCase(); // 입력 받으면서 대문자로 입력받기

		int[] arr = new int[26]; // 알파벳 갯수를 세기위한 배열선언.

		int max = 0;
		int index = 0;

		for (int i = 0; i < str.length(); i++) {
			int a = str.charAt(i); // 입력받은 문자의 i번째 문자의 아스키 코드값 넣기.
			arr[a - 65]++; // 대문자 A의 ASCII 코드 값은 65. 65-65를 하면 소문자 a부터 갯수를 세게 됨.
			// 0~25 배열을 통해. 각 문자가 몇개인지 셀 수 있음.
		}

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i]; // 가장 많은 알파벳 max에 담기.
				index = i + 65; // 가장 많은 알파벳의 i에 65를 더하면 그 문자의 ASCII 코드 값이 나옴. - 대문자로 출력하기 위해서 +65
			} else if (max == arr[i]) {
				index = '?';
			}
		}
		System.out.println((char) index); // ASCII코드를 문자로 출력

	}

}
