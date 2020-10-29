package greedy;

import java.util.*;

public class ex07_볼링공고르기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 공의 개수 입력
		int m = sc.nextInt(); // 공이 가지는 무게 입력
		int[] arr = new int[11]; // 각 무게별로 볼링공을 확인하기 위한 배열(1~10)
		
		// 각 무게별로 존재하는 공의 개수를 저장
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			arr[x] += 1; // 무게별로 공이 존재하게되면 +1개씩
		}
		
		int result = 0; // 두 명에서 다른 무게의 공을 선택할 경우의 수
		
		// 1부터 m까지의 각 무게에 대한 처리
		for (int i = 1; i <= m; i++) {
			n -= arr[i]; // A의 무게가 i인 공의 개수
			result += arr[i] * n; // B가 선택하는 경우의 수와 곱하기
		}
		System.out.println(result);
	}

}
