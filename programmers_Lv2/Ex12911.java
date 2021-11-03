package programmers_Lv2;

public class Ex12911 {

	public static void main(String[] args) {
		// 다음 큰 숫자
		int n = 78;
		int answer = 0;
		String str = Integer.toBinaryString(n);
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				cnt++;
			}
		}

		for (int i = n + 1; i < 1000000; i++) {
			String s = Integer.toBinaryString(i);
			int scnt = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '1') {
					scnt++;
				}
			}

			if (cnt == scnt) {
				answer = i;
				break;
			}
		}

		System.out.println(answer);
	}

}
