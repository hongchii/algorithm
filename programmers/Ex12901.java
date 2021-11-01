package programmers;

public class Ex12901 {

	public static void main(String[] args) {
		// 2016년

		int a = 5, b = 24; // a월 b일
		String answer[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		int month[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 1월 ~ 12월까지 해당 월의 일수

		int tot = 0; // 일수를 더해 줄 변수

		for (int i = 1; i < a; i++) { // 1월 부터 a월 까지
			tot += month[i - 1]; // tot에 1월부터 a월까지의 일수를 더해줌.
		}
		System.out.println(tot);
		tot += b - 1; // b는 해당월의 일자. 1/1부터 시작해서 -1 해줌.

		System.out.println(answer[(tot + 5) % 7]); // 2016/1/1이 금요일이라서 tot + 5 . 7일로 나눠서 나머지가 해당 일자의 요일.
	}
}
