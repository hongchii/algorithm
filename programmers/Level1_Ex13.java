package programmers;

import java.util.Scanner;

public class Level1_Ex13 {

	public static void main(String[] args) {
		// 정수 제곱근 판별
		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();		
		long sqrt = (long) Math.sqrt(n);

		if (n == Math.pow(sqrt, 2)) {
			System.out.println( (long) (Math.pow(sqrt + 1, 2)) );
		} else {
			System.out.println( -1 );
		}
	}

}
