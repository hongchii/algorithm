package programmers;

public class Ex12943 {

	public static void main(String[] args) {
		
		// 콜라츠 추측
	}
	
	 public int solution(long num) {
	        int answer = 0;
	        
	        while(true){
	            if (answer >= 500){
	                answer = -1;
	                break;
	                
	            } else if (num % 2 == 0){ // 입력된 수가 짝수면 2로 나눈다.
	                num /= 2;
	                answer++;
	            } else if (num == 1){
	                break;
	                
	            } else {
	                num = num * 3 + 1;
	                answer++;
	            } 
	        }
	        return answer;
	    }
}
