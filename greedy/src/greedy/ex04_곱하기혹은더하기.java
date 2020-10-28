package greedy;

import java.util.Scanner;

// 어떠한 수 N이 1이 될 때까지
public class ex04_곱하기혹은더하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// N, K 공백을 기준으로 구분해 입력받기
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;

		while (true) {
			// N이 K로 나누어 떨어지는 수가 될 때까지 빼기
			int target = (n / k) * k; // 반복문을 쓰지않고 K가 나눌수 있는 N에 가까운 수를 찾음
			count += (n - target); // N과 찾은 수를 뺀 값이, -1 계산 횟수를 구한 값과 같음 -> count에 담음
			n = target; // K에 나눠지는 값을 N에 대입

			// K로 나눈 값을 다시 N에 넣고 count 1증가
			n /= k;
			count += 1;

			// N이 K보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
			if (n < k)
				break;
		}
		// 마지막으로 남은 수(K보다 작아진 N)에 대해 1씩 빼기
		count += (n - 1);
		System.out.println(count);
	}
}
