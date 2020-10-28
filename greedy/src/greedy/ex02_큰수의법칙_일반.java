package greedy;

import java.util.*;

// 큰 수의 법칙
public class ex02_큰수의법칙_일반 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int first = arr[n-1]; // 제일 큰 수
		int second = arr[n-2]; // 그 다음으로 큰 수
		int result = 0;
		
		while(true) {
			for (int i = 0; i < k; i++) {
				if (m == 0) break;
				result += first;
				m--;
			}
			if(m == 0) break;
			result += second;
			m--;
		}
		
		System.out.println(result);
	}
}