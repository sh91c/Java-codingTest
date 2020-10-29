package greedy;

import java.util.*;

public class ex08_문자열뒤집기 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int count0 = 0; // 전부 0으로 바꾸는 경우
		int count1 = 0; // 전부 1로 바꾸는 경우
		
		// 첫 번째 원소 처리
		if(str.charAt(0) == '1') {
			count0++;
		} else {
			count1++;
		}
		
		// 두 번째 원소부터 끝까지 확인
		for (int i = 0; i < str.length() - 1; i++) {
			if(str.charAt(i) != str.charAt(i+1)) {
				// 다음 수에서 1로 바뀌는 경우
				if(str.charAt(i+1) == '1')	count0++;
				// 다음 수에서 0으로 바뀌는 경우
				else count1++;
			}
		}
		System.out.println(Math.min(count0, count1));
	}

}
