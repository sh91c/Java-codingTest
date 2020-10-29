package 그리디;

import java.util.Scanner;

// 어떠한 수 N이 1이 될 때까지
public class ex03_n을1로만들기_일반 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// N, K 공백을 기준으로 구분해 입력받기
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;

		while( n >= k ) {
			if( n%k != 0) {
				n--;
				count++;
			} else {
				n /= k;
				count++;
			}
		}
		
		while (n > 1) {
			n--;
			count++;
		}
		System.out.println(count);
	}
}
