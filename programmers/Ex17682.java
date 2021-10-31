package programmers;

public class Ex17682 {

	public static void main(String[] args) {
		// [1차] 다트 게임
		String dartResult = "1S2D*3T";
		int answer = 0;
		int score[] = new int[3];
		char[] charArr = dartResult.toCharArray();
		int temp = 0;
		int index = 0;

		for (int i = 0; i < charArr.length; i++) {
			if (Character.isDigit(charArr[i])) { // Character.isDigit()입력값이 숫자인지 여부를 판단.
				if (temp == 0) { // 점수가 한 자리수 일때
					temp = Character.getNumericValue(charArr[i]); // getNumericValue() 숫자형태의 char를 int형으로 반환.
				} else { // 점수가 두 자리수 일때
					temp = temp * 10 + Character.getNumericValue(charArr[i]);
				}

			} else if (charArr[i] == 'S' || charArr[i] == 'D' || charArr[i] == 'T') { // 점수 계산
				if (charArr[i] == 'S') {
					score[index] = (int) Math.pow(temp, 1);
					temp = 0;
					index++;
				} else if (charArr[i] == 'D') {
					score[index] = (int) Math.pow(temp, 2);
					temp = 0;
					index++;
				} else if (charArr[i] == 'T') {
					score[index] = (int) Math.pow(temp, 3);
					temp = 0;
					index++;
				}
			} else { // 스타상, 아차상시 점수 계산
				if (charArr[i] == '#') {
					score[index - 1] *= -1;
				} else if (charArr[i] == '*') {
					score[index - 1] *= 2;
					if (index > 1) {
						score[index - 2] *= 2;
					}
				}
			}
		}

		for (int i = 0; i < score.length; i++) {
			answer += score[i];
		}
		System.out.println(answer);
	}

}
