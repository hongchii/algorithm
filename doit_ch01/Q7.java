package doit_ch01;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int sum = 0;
		int i = 1;
		for (i = 1; i <= n; i++) {
			sum += i;
			if (i < n) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i);
			}
		}
		System.out.println(" = " + sum);

	}

}
