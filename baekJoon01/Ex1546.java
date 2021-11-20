package baekJoon01;

import java.util.Scanner;

public class Ex1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int score = sc.nextInt();
		int n[] = new int[score];

		double max=0.0, tmp=0.0, newscore=0.0, avg=0.0;
	

		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
			if (max < n[i]) {
				max = n[i];
			}

		}
		for (int i = 0; i < n.length; i++) {
			tmp = (n[i] / max) * 100.0;
			newscore += tmp;

		}
		avg = newscore / n.length;
		System.out.println(avg);

	}

}
