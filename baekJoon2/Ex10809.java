package baekJoon2;

import java.util.Scanner;

public class Ex10809 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String alphabet = scan.next();
		scan.close();
		
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(alphabet.indexOf(ch) + " ");
		}
		
	}

}
