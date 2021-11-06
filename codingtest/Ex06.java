package codingtest;

import java.util.Arrays;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double time =  3.5; // 남은 휴가
		String[][] plans = {{"홍콩", "11PM", "9AM"}, 
				{"엘에이", "3PM", "2PM"}};
		// 여행지, 출발시간, 도착시간
//		System.out.println(plans[0].length);
		
		String s1 = "";
		String s2 = "";
	//	String[] arr = new String[plans.length];
		
		for(int i = 0; i < plans[0].length; i++) {		
			if(plans[i][1].length() % 2 == 0) {
			char ch = plans[i][1].charAt(i);
				
				//s2 = plans[1][i];
			}
			System.out.println(ch);
			System.out.println(s2);
		}
		// 월 도착 : 1pm, 출발 : 6pm
		// 금 도착 : 9.5am, 출발 : 6pm
			
		
		
	}

}
