package programmers;

public class Ex81301 {

	public static void main(String[] args) {
		// 숫자 문자열과 영단어

		String[] arr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String s = "one4seveneight";
		int answer = 0;

		for (int i = 0; i < arr.length; i++) {
			s = s.replace(arr[i], String.valueOf(i));

		}
		answer = Integer.parseInt(s);
		System.out.println(answer);
	}

}
