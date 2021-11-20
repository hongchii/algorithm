package greedy;

public class P87 {

	public static void main(String[] args) {
		// 이.코.테 예제 3-1 거스름돈

		int n = 1260;
		int[] coin = { 500, 100, 50, 10 };

		int cnt = 0, tmp = 0;

		for (int i = 0; i < coin.length; i++) {
			cnt += n / coin[i];
			n %= coin[i];

		}
		System.out.println(cnt);
	}

}
