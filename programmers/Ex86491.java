package programmers;

public class Ex86491 {

	public static void main(String[] args) {
		// 최소직사각형

		//int sizes[][] = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } }; // w,h 형식.
		//int sizes[][] = { { 10, 7 }, { 12, 3 }, { 8, 15 }, { 14, 7 }, { 5, 15 } };
		int sizes[][] = { { 14, 4 }, { 19, 6 }, { 6, 16 }, { 18, 7 }, { 7, 11 } };
		
		
		int w = 0, h = 0;
		int answer = 0;

		for (int i = 0; i < sizes.length; i++) {
			if (sizes[i][1] <= sizes[i][0]) { // w <= h
				w = Math.max(sizes[i][0], w);
				h = Math.max(sizes[i][1], h);
			} else {
				w = Math.max(sizes[i][1], w);
				h = Math.max(sizes[i][0], h);
			}
		}

		answer = w * h;
		System.out.println(answer);
	}

}
