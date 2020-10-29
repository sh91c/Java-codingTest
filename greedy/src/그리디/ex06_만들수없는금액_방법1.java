package 그리디;

import java.util.*;

public class ex06_만들수없는금액_방법1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int result = 0;
		int max = 0;
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		// 오름차순 정렬
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			// 2원보다 크거나 같을 때는 1원이 최솟값임
			if(arr[0] >= 2) {
				result = 1;
			} else {
				max = arr[n-1];
				if(arr[i] < max) {
					result += arr[i];
				}
			}
		}
		if(result == 1) {
			System.out.println(result);
		} else {
			result++;
			System.out.println(result);
		}
	}

}
