package codingtest;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3 };
		int[] su = { 1, 2, 3 };
		int[] answer = new int[su.length];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < su.length; j++) {
				if (arr[i] == su[j]) {
					answer[j]++;
				}
			}

		}

		//System.out.println(Arrays.toString(answer));
		int max = Math.max(answer[0], Math.max(answer[1], answer[2]));
		//System.out.println(max);
		int[] result = new int[answer.length];
		
		for (int i = 0; i < answer.length; i++) {
			
			if ( max > answer[i]) {
				result[i] = max - answer[i];
			}
			

		}
	//	System.out.println(Arrays.toString(result));
		
	}

}
