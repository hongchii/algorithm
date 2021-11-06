package codingtest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ings = {"r 10", "a 23", "t 124", "k 9"};
		
		String[] menu = {"PIZZA arraak 145", "HAMBURGER tkar 180", "BREAD kkk 30", 
				"ICECREAM rar 50", "SHAVEDICE rar 45", "JUICE rra 55", "WATER a 20"};
		
		String[] sell = {"BREAD 5", "ICECREAM 100", "PIZZA 7", "JUICE 10", "WATER 1"};
		
		String[][] str = new String[2][2];
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < ings.length; i++) {
			for(int j = 0; j < ings.length; j++) {
			}
		}
		int answer = 0;
		
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list = new ArrayList<>();
		
		for(String tmp : ings) {
			list1.add(tmp);
		}
		
		for(String tmp : menu) {
			list.add(tmp);
		}
		System.out.println(list1);
		System.out.println(list);
	/*	
		for(int i = 0; i < menu.length; i++) {
			
			String[] st = menu[i].split("");
					System.out.println(st[i]);
		}
		*/
 	}

}
