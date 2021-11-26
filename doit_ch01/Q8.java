package doit_ch01;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		// 1부터 10까지의 합 (1 + 10) * 5
		int sum = (n + 1) * (n / 2);
		if (n % 2 != 0) {
			sum += (n + 1) / 2;
		}

		System.out.println(sum);
	}

}
