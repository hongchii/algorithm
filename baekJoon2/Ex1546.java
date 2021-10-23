package baekJoon2;

import java.util.Scanner;

public class Ex1546 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int arr[] = new int[n];
		float total = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		float max = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		float tmp = 0;
		for(int i = 0; i < arr.length; i++) {
				tmp = arr[i] / max * 100;
				total += tmp;
		}
		total /=  n;
		
		System.out.println(total);
		
	} // end main

} // end class
