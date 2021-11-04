package baekJoon2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex3048 {

	public static void main(String[] args) {
		// 개미

		Scanner scan = new Scanner(System.in);

		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		String str = scan.next().toUpperCase();
		StringBuffer sb = new StringBuffer(str);
		
		String[] a_group = sb.reverse().toString().split(""); // CBA
		String[] b_group = scan.next().toUpperCase().split(""); // DEF
		
		String[] ant = new String[a_group.length + b_group.length];
		int t = scan.nextInt();

		
		int change = 0;
//		for (int i = 0; i < t; i++) { // 만약에 3이야 0,1,2
			
//			for(int j = )
//
//			int cnt = 1;
//		
//		
		

//		
//			if (change == 0) {
//				String tmp = a_group[a_group.length-1];
//				a_group[a_group.length-1] = b_group[0];
//				b_group[0] = tmp;
//				change++;
//				
//				ant[i] = a_group[i];
//				ant[a_group.length - 1 + i] = b_group[i];
//				
//				
//				
//				System.out.println(Arrays.toString(a_group) + Arrays.toString(b_group));
//				continue;
//			}else {
//				
//			}
//			
//			for(int j = 0; j < ant.length; j++) {
//				
//			}
//				// t == 1
//	
//				// t == 2, change = 1;
//				String a = a_group[cnt]; // 1
//				a_group[cnt] = a_group[cnt+i]; // 1 , 2
//				a_group[cnt+i] = a; // 2
//				String b = b_group[cnt]; // 0 
//				b_group[cnt-1] = b_group[cnt]; // 0 , 1
//				b_group[cnt] = b; // 1
//				cnt--;
//				System.out.println(Arrays.toString(a_group) + Arrays.toString(b_group));
//	
//				// t == 3
//				String c = a_group[0];
//				a_group[0] = a_group[1];
//				a_group[1] = c;
//				String d = a_group[2];
//				a_group[2] = b_group[0];
//				b_group[0] = d;
//				String e = b_group[2];
//				b_group[2] = b_group[1];
//				b_group[1] = e;
//	
//	
//	
//				System.out.println(Arrays.toString(a_group) + Arrays.toString(b_group));
//			
//		}

		// String[] arr = reverse.split("");
		// String[] arr1 = str1.split("");
		// System.out.println(reverse + str1);
		// list.add(reverse+str1);
		/*
		 * CBA DEF 0 
		 * CBD AEF 1 
		 * CDB EAF 2
		 * DCE BFA 3
		 */

		// while (t >= 0) { // t의 횟수만큼 스와이프

//		if ( t == 1) {
//			System.out.println();
//			//list.add(3, list.get(2));
//			//list.remove(2);
//		}
		// System.out.println(list);

//			for (int i = 1; i <= t; i++) { // 1부터 t까지
//				// ArrayList에 값을 추가하려면 ArrayList의 add(index, value) 메소드를 사용하면 됩니다. index중간에 값을 추가하면 해당 인덱스부터 마지막 인덱스까지 모두 1씩 뒤로 밀려납니다. 
//				
//				//reverse.charAt(i + 2); // A
//				//reverse.charAt(i + 1); // B
//				//reverse.charAt(i + 0); // C
//
////				str1.charAt(i); // D
////				str1.charAt(i + 1); // E
////				str1.charAt(i + 2); // F
//				
//				char tmp = reverse.charAt(reverse.length() - i); // A
//				char stmp = str1.charAt(i-1); // D
//				
//				str1 = str1.replace(str1.charAt(i-1), tmp); // A를 D에 넣어줘야함.
//				reverse = reverse.replace(reverse.charAt(reverse.length() - i), stmp);
//				
//				
//				System.out.println(reverse + str1);
//			}
		// }
		// System.out.println(reverse + str1); // 변화가 없으면 그대로 출력
	}

}
