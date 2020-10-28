package greedy;

import java.util.Scanner;

public class ex01_거스름돈2 {

	public static void main(String[] args) {
		// 거스름 돈 : 거슬러야 할 N원에 대한 동전의 최소 개수 (500원, 100원, 50원, 10원)
		Scanner sc = new Scanner(System.in);

		// 거스름 돈 입력
		int n = sc.nextInt();

		// coin_type
		int[] coin_type = { 500, 100, 50, 10 };

		// 동전 개수 구하기
		int count = 0;

		for (int i : coin_type) {
			count += n / i;		// 돈 / 동전 나뉘는 값이 동전 개수
			n %= i;             // 돈 / 동전 나누고 남은 잔돈
		}
		
		System.out.println(count); // 총 동전 개수
	}

}
