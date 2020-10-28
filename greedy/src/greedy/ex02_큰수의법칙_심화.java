package greedy;

import java.util.*;

// 큰 수의 법칙
public class ex02_큰수의법칙_심화 {

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
		
		int count = (m / (k+1)) * k; // 가장 큰 수가 더해지는 횟수
		count += m % (k + 1);		 // (m / (k+1))로 나누어떨어지지 않는 경우를 고려해야함
		
		int result = 0;
		result = count * first; // 더해질 횟수는 곱이니까 곱 연산
		result += (m - count) * second; // 큰 수의 반복이 끝나고 한번씩 더해지는 두 번째로 큰 수
		
		System.out.println(result);
	}
}