package programmers;

public class Ex86051 {

	public static void main(String[] args) {
		// 없는 숫자 더하기

		int[] numbers = { 1, 2, 3, 4, 6, 7, 8, 0 };
		int answer = 45;

		for (int i = 0; i < numbers.length; i++) {
			answer -= numbers[i];
		}

		/*
		 * ArrayList<Integer> list = new ArrayList<>();
		 * 
		 * for (int i = 0; i < numbers.length; i++) { list.add(numbers[i]); }
		 * 
		 * for (int i = 0; i < 10; i++) { if (!list.contains(i)) { answer += i; } }
		 */

		System.out.println(answer);
	}

}
