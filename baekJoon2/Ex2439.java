package baekJoon2;

import java.util.Scanner;

public class Ex2439 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		for (int i = 1; i <= n; i++) { 
			for (int j = 1; j <= n-i; j++) { 
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
