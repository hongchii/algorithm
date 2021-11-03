package programmers_Lv2;

public class Ex12951 {

	public static void main(String[] args) {
		// JadenCase 문자열 만들기
		// String answer = "";
		String s = "3people unFollowed me";

		String[] arr = s.toLowerCase().split(" ", -1); // 공백도 문자취급해주기
		StringBuilder answer = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() == 0) {
				if (i == arr.length - 1)
					continue;
				answer.append(" ");
				continue;
			} else if (arr[i].charAt(0) >= 'a' && arr[i].charAt(0) <= 'z') {
				answer.append(arr[i].substring(0, 1).toUpperCase());
				answer.append(arr[i].substring(1, arr[i].length()));
			} else {
				answer.append(arr[i]);
			}

			if (i != arr.length - 1)
				answer.append(" ");

		}

		System.out.println(answer.toString());
	}

}
