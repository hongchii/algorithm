package programmers;

import java.util.ArrayList;

public class Ex1845 {

	public static void main(String[] args) {
		// 폰켓몬
		
		int answer = 0;
		int[] nums = { 3, 3, 3, 2, 2, 4 };
		ArrayList<Integer> list = new ArrayList<Integer>(); // 중복되는 값을 제외한 값을 저장할 리스트

		for (int i = 0; i < nums.length; i++) {
			if (!list.contains(nums[i])) { // 리스트에 없으면
				list.add(nums[i]); // 리스트에 넣어준다.

				answer++; // 갯수 체크
			}
		}

		int max = nums.length / 2; 
		if (max < answer) {
			System.out.println(answer);
		} else {
			System.out.println(max);
		}
	}

}
