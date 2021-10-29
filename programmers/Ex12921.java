package programmers;

import java.util.Scanner;

public class Ex12921 {

	public static void main(String[] args) {
		// 소수 찾기

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int answer = 0;

		int arr[] = new int[n+1]; 

		for (int i = 2; i <= n; i++) 
		     arr[i] = i;
		
		for (int i = 2; i < n; i++) {
		
			if (arr[i] == 0) 
			   continue;

			for (int j = 2 * i; j <= n; j += i) 
			    arr[j] = 0; // 2의 배수들은 전부 0으로 
		}
		
		for (int i = 0; i < arr.length; i++) { 
		
			if (arr[i] != 0) // 0이 아닌것들을 카운트
			    answer++;
			
		}

		System.out.println(answer);

	}

}
