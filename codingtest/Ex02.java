package codingtest;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] log = { "8:30", "09:00", "14:00", "16:00", 
				"16:01", "16:06", "16:07", "16:11" };
		
		int[] time = new int[log.length];
		for (int i = 0; i < log.length; i++) {
		//	String[] str = log[i].split(":");
			time[i] = Integer.parseInt(log[i].replace(":", ""));
		//	System.out.println(time[i]);
		}
	//	System.out.println("-");
		int[] hh = new int[time.length];
		int[] mm = new int[time.length];
		for(int i = 0; i < time.length; i++) {
			hh[i] = time[i] / 100;
			mm[i] = time[i] % 100;
			
	//		System.out.println(hh[i]);
	//		System.out.println(mm[i]);
	//		System.out.println("===========");
		}	

		
		int index = 1;
		int tot = 0;
		
		for(int i = 0; i < time.length; i++) {
			int tmp = mm[index] - mm[i];
			
			if(tmp < 0 ) {
				hh[index] -= 1;
				mm[index] += 60;
				tot += mm[index] - mm[i];
			}else if (tmp == 0) {
				tmp = hh[index] - hh[i];
				tmp += tmp * 60;
				if( tmp >= 105) {
					tmp = 105;
					tot += tmp;
				}else {
					tot += tmp;
				}
		//		System.out.println(tmp);
			}else if (tmp >= 5) {
				tot += tmp;
			}
			
		//	System.out.println("1==" + tot);
			
			
			index += 2;
			i += 1;
		}
		
		int h1 = tot / 60;
		int m1 = tot % 60;
		
		String s1 = String.valueOf(h1);
		if(s1.length() < 2) {
			s1 = "0" +s1;
		}
		String s2 = String.valueOf(m1);
		
		String answer = "";
		answer = s1 +s2;
				
		System.out.println("결과::" +s1 + ":" + s2);
	
	
	}

}
