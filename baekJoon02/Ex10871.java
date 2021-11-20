package baekJoon02;

import java.io.IOException;
import java.util.Scanner;

public class Ex10871 {

	public static void main(String[] args) throws IOException{
		
		/*
		  정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 
		  이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int x = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < x) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}