package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class Ex42889 {

	public static void main(String[] args) {
		// 실패율
		int N = 5; // 스테이지개수
		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 }; // 각 스테이지에 머물러 있는 이용자 수
		int answer[] = new int[N];
		double[] stage = new double[N + 1];

		for (int i : stages) {
			if (i == N + 1) {
				continue;
			}
			stage[i]++;
		}

		ArrayList<Double> fail = new ArrayList<Double>();

		double num = stages.length;

		double tmp = 0;

		for (int i = 1; i < stage.length; i++) {
			tmp = stage[i];
			if (num == 0) {
				stage[i] = 0;
			} else {
				stage[i] = stage[i] / num;
				num = num - tmp;
			}
			fail.add(stage[i]);
		}

		Collections.sort(fail, Collections.reverseOrder());

		for (int i = 0; i < fail.size(); i++) {
			for (int j = 1; j < stage.length; j++) {
				if (fail.get(i) == stage[j]) {
					answer[i] = j;
					stage[j] = -1;
					break;
				}
			}
		}
		// System.out.print(Arrays.sort(answer));
	}

}
