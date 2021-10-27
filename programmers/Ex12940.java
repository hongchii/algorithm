package programmers;

import java.util.Arrays;
import java.util.Scanner;

public class Ex12940 {

	public static void main(String[] args) {
		// 최대공약수와 최소공배수
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int arr[] = new int[2];
		
		arr[0] = gcd(n, m);
		arr[1] = n * m / arr[0];
		
		System.out.println(Arrays.toString(arr));
	}

	public static int gcd(int a, int b) {
		
		while(b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		
		return a;
	}
}
