package baekJoon2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex15552 {

	public static void main(String[] args) throws IOException {
		/*
		 Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. 
		 BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
		 */
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(bf.readLine()); // BufferedReader로 입력을 받으면 입력된 문자를 문자열로 받기 때문에 parseInt 해줘야한다. 
		
		for (int i = 0; i < t; i++) {
			String s = bf.readLine();
			int a = Integer.parseInt(s.split(" ")[0]);
			int b = Integer.parseInt(s.split(" ")[1]);
		    bw.write(a + b + "\n");
        }
        bw.flush();
		
	}

}
