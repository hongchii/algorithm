package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class ExGreedy02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 배열의 크기
		int m = sc.nextInt(); // 더해지는 횟수
		int k = sc.nextInt(); // 연속해서 더할 횟수

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr); // 배열을 오름차순으로 정렬
		int first = arr[n - 1]; // 가장 큰 수
		int second = arr[n - 2]; // 두 번째로 큰 수
		int res = 0; // 결과 저장
		int cnt = 0; // 반복 횟수 카운트 
		
		 for(int i = 0; i < m; i++){

	            if(cnt < k){ 
	            	res += first;
	            	cnt++;
	            }
	            else{
	            	res += second;
	            	cnt = 0;
	            }
	        }
		System.out.println(res);

	}
}
