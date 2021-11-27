package doit_ch01;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int a;

		do {
			System.out.print("양의 정수 입력 : ");
			a = scan.nextInt();

		} while (a <= 0);
		
		int tmp = 0;
		
		while(a > 0) {
			a = a / 10;
			tmp++;
		}
		System.out.println("그 수는 " + tmp + "자리입니다.");
	}

}
