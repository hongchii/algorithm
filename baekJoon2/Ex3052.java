package baekJoon2;

import java.util.Scanner;

public class Ex3052 {

	public static void main(String[] args) {
		/*
		 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 
		 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
 		 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 
 		 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
		 */
		
		Scanner scan = new Scanner(System.in);
		int su[] = new int[10]; // 입력 받을 수
		int arr[] = new int[10]; // 나머지를 저장 할 배열
		
		for(int i = 0; i < su.length; i++ ) {
			su[i] = scan.nextInt();
			
			arr[i] = su[i] % 42;  // 입력된 수를 42로 나눈 수를 arr에 저장
		}
		int cnt = 0; // 개수 카운트
		
		for(int i = 0; i < arr.length; i++) {
			// i == 0,1,2,3,4,5,6,7,8,9 , arr.length == 10
			int tmp = 0;
			
			for(int j = i + 1; j < arr.length; j++) {
				// j == 1,2,3,4,5,6,7,8,9 , arr.length == 10
				if (arr[i] == arr[j] ) { 
					// i == 0,1,2,3,4,5,6,7,8,9
					// j == 1,2,3,4,5,6,7,8,9 
					tmp++;
				}
			}
			
			if (tmp == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	
	}

}
