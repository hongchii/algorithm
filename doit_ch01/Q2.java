package doit_ch01;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		System.out.println(min3(a, b, c));
	}

	static int min3(int a, int b, int c) {

		int min = a;

		if (min > b)
			min = b;
		if (min > c)
			min = c;

		return min;
	}

}
