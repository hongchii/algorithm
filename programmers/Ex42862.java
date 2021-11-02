package programmers;

import java.util.Arrays;

public class Ex42862 {

	public static void main(String[] args) {
		// 체육복
		int n = 5; // 전체 학생의 수
		int[] lost = { 2, 4 }; // 체육복을 도난당한 학생의 번호
		int[] reserve = { 1, 3, 5 }; // 여벌의 체육복이 있는 학생의 번호

		int answer = n - lost.length; // 수업을 들을 수 있는 학생 = 전체 학생 수 - 체육복 잃어버린 학생

		Arrays.sort(lost);
		Arrays.sort(reserve);

		// 여벌 체육복이 있는 학생이 도난 당한 경우
		for (int i = 0; i < lost.length; i++) { // 도난 당한 학생
			for (int j = 0; j < reserve.length; j++) { // 여벌 있는 학생
				if (lost[i] == reserve[j]) { // 도난 당한 학생 == 여벌 있는 학생
					answer++; // 수업을 들을 수 있는 학생 ++;
					lost[i] = -1;
					reserve[j] = -1;
					break;
				}
			}
		}

		// 도난 당한 학생에게 체육복을 빌려주는 경우
		for (int i = 0; i < lost.length; i++) { // 도난 당한 학생
			for (int j = 0; j < reserve.length; j++) { // 여벌 있는 학생
				if ((lost[i] - 1 == reserve[j]) || (lost[i] + 1 == reserve[j])) { // 앞, 뒷번호 학생에게 체육복을 빌려줌
					answer++; // 수업을 들을 수 있는 학생 ++;
					reserve[j] = -1;
					break;
				}
			}
		}
		System.out.println(answer);
	}

}
