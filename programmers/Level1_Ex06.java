package programmers;

public class Level1_Ex06 {

	public static void main(String[] args) {

	}
	
    public String solution(String phone_number) {
        String answer = "";
        
        for(int i = 0; i < phone_number.length(); i++){
            
            if(i < phone_number.length()-4){
                answer += "*";
            }else{
                answer += phone_number.charAt(i);
            }
        }
        return answer;
    }
	
}
