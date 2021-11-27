package doit_ch01;

import java.util.Scanner;

public class Q9 {

	static int sumof(int a, int b) {
		int sum = 0;

		if (a < b) {
			while (a <= b) {
				sum += a;
				a++;
			}
		} else {
			while (a >= b) {
				sum += a;
				a--;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("a의 값 :");
		int a = scan.nextInt();
		System.out.print("b의 값 : ");
		int b = scan.nextInt();

		System.out.println(sumof(a, b));
	}

}
