package programmers_Lv2;

public class Ex12939 {

	public static void main(String[] args) {
		// 최댓값과 최솟값
		String answer = "";
		String s = "1 2 3 4";
		
		String[] str = s.split(" ");
		int[] arr = new int[str.length];

		for (int i = 0; i < str.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}

		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}

		answer = min + " " + max;
		System.out.println(answer);
	}

}
