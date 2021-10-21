package baekJoon2;

import java.util.Scanner;

public class Ex1110 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();	
		int m = n;
		int c = 0;
		scan.close();
		while (true) {
			n = ( ( n % 10 ) * 10  + ( n / 10 + n % 10) % 10 );  // 10의자리 + 1의 자리.
			c++;
			
			if (m == n) {
				break;
			}
			
		}
		System.out.println(c);
		
	}

}
