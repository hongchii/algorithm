package doit_ch01;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();

		System.out.println(max4(a, b, c, d));

	}

	static int max4(int a, int b, int c, int d) {

		int max = a;
		
		if (max < b)
			max = b;
		if (max < c)
			max = c;
		if (max < d)
			max = d;

		return max;
	}

}
