package baekJoon2;

import java.util.Scanner;

public class Ex10818 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); // 정수의 개수
		int arr[] = new int[n]; // 정수를 담는 배열
		int min = 0; // 최솟값
		int max = 0; // 최댓값
		
		for(int i=0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			
		}
		min = arr[0];
		max = arr[0];
	
		for(int i=0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min + " " + max);
	}

}
