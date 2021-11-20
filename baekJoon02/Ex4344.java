package baekJoon02;

import java.util.Scanner;

public class Ex4344 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt(); // 테스트 케이스 수

		for (int i = 0; i < t; i++) { // 테스트 케이스 수 만큼 for문 돌리기
			
			int cnt = 0; // 평균 넘는 학생 수 카운트
			int sum = 0; // 총점
			float avg = 0.0f; // 비율
			int su = scan.nextInt(); // 학생 수
			int score[] = new int[1000]; // 학생 수 만큼 점수를 담을 배열

			for (int j = 0; j < su; j++) {
				score[j] = scan.nextInt(); // 학생 수 만큼 점수 받기

				sum += score[j];
			}
			
			sum /= su; // 평균 구하기

			for (int k = 0; k < score.length; k++) {
				if (sum < score[k]) { // 평균 보다 높은 점수
					cnt++; // 높으면 cnt+1
				}
			}

			avg = (float) cnt / su * 100;
			System.out.printf("%5.3f%%%n", avg);
		}

	}

}
