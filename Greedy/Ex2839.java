package Greedy;

import java.util.Scanner;

public class Ex2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int cnt = n / 5; 
		sc.close();

		switch (n % 5) {
		case 0:
			System.out.println(cnt);
			break;
		case 1:
		case 3:
			cnt++;
			System.out.println(cnt);
			break;
		case 2:
			if (cnt < 2) {
				System.out.println(-1);
			} else {
				System.out.println(cnt + 2);
			}
			break;
		case 4:
			if (cnt < 1) {
				System.out.println(-1);
			} else {
				System.out.println(cnt + 2);
			}
			break;

		}

	}

}
