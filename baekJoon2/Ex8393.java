package baekJoon2;

import java.util.Scanner;

public class Ex8393 {

	public static void main(String[] args) {
		
		/*
		 n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오. 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.close();
		
		int tmp = 0;
		for( int i = 1; i <= n; i++) {
			tmp += i;
		}
		System.out.println(tmp);
	}

}
