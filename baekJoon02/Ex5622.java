package baekJoon02;

import java.util.Scanner;

public class Ex5622 {

	public static void main(String[] args) {
		// 다이얼
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine().toUpperCase();
		int n = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 87) { // W~Z, 87~90
				n += 10;
			} else if (str.charAt(i) >= 84) { // T~V, 84~86
				n += 9;
			} else if (str.charAt(i) >= 80) { // P~S, 80~83
				n += 8;
			} else if (str.charAt(i) >= 77) { // M~O, 77~79
				n += 7;
			} else if (str.charAt(i) >= 74) { // J~L, 74~76
				n += 6;
			} else if (str.charAt(i) >= 71) { // G~I, 71~73
				n += 5;
			} else if (str.charAt(i) >= 68) { // D~F, 68~70
				n += 4;
			} else { // A~C, 65~67
				n += 3;
			}
		}
		System.out.println(n);

	}
}
