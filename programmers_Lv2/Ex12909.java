package programmers_Lv2;

public class Ex12909 {

	public static void main(String[] args) {
		// 올바른 괄호
		String s = "())(";
		boolean answer = true;
		int cnt = 0;
		
		if (s.charAt(0) == ')') answer = false;
		
		for(int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) == '(') {
				cnt++;
			}else {
				if(cnt <= 0) answer = false;
				cnt--;
			}
		}
		
		if(cnt != 0) {
			answer = false;
		}
		/*
		String[] arr = s.split("");
		int a = 0, b = 0;
		
		if (arr[0].equals(")") || arr[arr.length - 1].equals("(") ) {
			answer = false;
		}
		
		for (int i = 0; i < arr.length; i++) {
			
		

			if (arr[i].equals("(")) {
				a++;
			} else {
				b++;
			}
		}

		if (a != b) {
			answer = false;
		}
		*/
		System.out.println(answer);
	}

}
