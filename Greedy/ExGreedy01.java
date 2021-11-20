package greedy;

public class ExGreedy01 {

	public static void main(String[] args) {
		int n = 1260;
		int cnt = 0;
		int[] coinType = { 500, 100, 50, 10 };

		for (int i = 0; i < coinType.length; i++) {
			int coin = coinType[i];
			cnt += n / coin;
			n %= coin;
		}
		System.out.println(cnt);
	}

}
