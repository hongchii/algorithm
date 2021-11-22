package doit_ch01;

import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdIn = new Scanner(System.in);

		System.out.println("세개의 정수 값을 구한다.");
		System.out.print("a : ");
		int a = stdIn.nextInt();
		System.out.print("b : ");
		int b = stdIn.nextInt();
		System.out.print("c : ");
		int c = stdIn.nextInt();
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;

		System.out.println("세개의 정수 중 최댓값은 : " + max);
	}

}
