package baekJoon2;

import java.util.Scanner;

public class Ex2562 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n[] = new int[9];
		for (int i = 0; i < n.length; i++) {
			n[i] = scan.nextInt();
			
		}
		scan.close();
		int max = n[0];
		int index = 0;

		for (int i = 0; i < n.length; i++) {

			if (max <= n[i]) {
				max = n[i];
				index = i + 1;
				//System.out.println("max =" + max );
				//System.out.println("index =" + index);
			}
		}
		System.out.println(max);
		System.out.println(index);
	}

}
