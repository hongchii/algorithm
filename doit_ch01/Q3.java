package doit_ch01;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();

		System.out.println(min4(a, b, c, d));
	}

	static int min4(int a, int b, int c, int d) {

		int min = a;

		if (min > b)
			min = b;
		if (min > c)
			min = c;
		if (min > d)
			min = d;

		return min;
	}

}
