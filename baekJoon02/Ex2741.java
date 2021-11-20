package baekJoon02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex2741 {

	public static void main(String[] args) throws IOException {
		
		/*
		 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.	
		 */
	/*	
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		scan.close();
		
		for (int i=1; i <= n; i++) {
			System.out.println(i);
		}
	
	 */
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		
		for(int i = 1; i <= n; i++) {
			bw.write(i + "\n");
		}
		bw.flush();
		bw.close();
	}
	
}
