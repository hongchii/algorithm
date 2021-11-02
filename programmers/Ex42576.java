package programmers;

import java.util.Arrays;

public class Ex42576 {

	public static void main(String[] args) {
		// 완주하지 못한 선수
		String[] participant = { "leo", "kiki", "eden" }; // 참여한 선수
		String[] completion = { "eden", "kiki" }; // 완주한 선수

		// 참여 선수, 완주 선수 정렬하기
		Arrays.sort(participant);
		Arrays.sort(completion);

		int i = 0;
		for (i = 0; i < completion.length; i++) { // 완주한 선수만큼
			if (!participant[i].equals(completion[i])) { // 참여한 선수 != 완주한 선수
				break;
			}
		}

		System.out.println(participant[i]);
	}

}
