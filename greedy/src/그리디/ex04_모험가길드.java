package 그리디;

import java.util.*;

public class ex04_모험가길드 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		// 그룹 수
		int result = 0;
		// 그룹 원 수 (그룹 결성 완료 시 초기화 되어야 함)
		int count  = 0;
		
		for (int i = 0; i < arr.length; i++) {
			count++;
			if(count >= arr[i]) {
				result++;
				count = 0;
			}
		}
		System.out.println(result);
	}
}
