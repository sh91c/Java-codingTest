package greedy;

import java.util.*;

public class ex05_숫자카드게임_한줄씩입력받기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력
		int n = sc.nextInt();
		int m = sc.nextInt();
		int result = 0;
		
		// 한 줄 씩 입력 받아 확인하기
		for (int i = 0; i < n; i++) {
			// 현재 줄에서 '가장 작은 수' 찾기
			int min_value = 10001;
			for (int j = 0; j < m; j++) {
				int data = sc.nextInt();
				min_value = Math.min(data, min_value);
			}
			// '가장 작은 수'들 중에서 가장 큰 수 찾기
			result = Math.max(min_value, result);
		}
		System.out.println(result);
	}

}
