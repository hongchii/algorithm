package programmers;

import java.util.ArrayList;

public class Ex72410 {

	public static void main(String[] args) {
		// 신규 아이디 추천
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		String answer = "";

		// 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
		new_id = new_id.toLowerCase(); // 소문자로 변경

		// 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
		String regex = "[^a-z0-9-_.]"; // 소문자, 숫자, - _ . 정규식
		new_id = new_id.replaceAll(regex, "");

		// 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
		regex = "\\.{2,}";
		new_id = new_id.replaceAll(regex, "");

		ArrayList<Character> charList = new ArrayList<>();

		for (int i = 0; i < new_id.length(); i++) {
			charList.add(new_id.charAt(i));
		}

		// 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
		if (charList.size() > 0) {
			if (charList.get(0) == '.')
				charList.remove(0);
			if (charList.size() > 0 && '.' == charList.get(charList.size() - 1))
				charList.remove(charList.size() - 1);
		}

		// 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
		if (charList.size() == 0)
			charList.add('a');

		for (Character i : charList) {
			answer += i;
		}

		if (answer.length() >= 16) {
			answer = answer.substring(0, 15);

			if (answer.charAt(answer.length() - 1) == '.') {
				answer = answer.substring(0, answer.length() - 1);
			}
		}

		// 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
		if (answer.length() <= 2) {
			while (answer.length() < 3) {
				answer += answer.substring(answer.length() - 1);
			}
		}
		System.out.println(answer);
	}

}
