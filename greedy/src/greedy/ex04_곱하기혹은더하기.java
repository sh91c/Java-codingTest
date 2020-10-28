package greedy;

import java.util.Scanner;

// 어떠한 수 N이 1이 될 때까지
public class ex04_곱하기혹은더하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력 조건 : 첫째 줄에 여러 개의 숫자로 구성된 문자열 S가 주어짐(1 <= S <= 20)
		// 출력 조건 : 첫째 줄에 만들어질 수 있는 가장 큰 수를 출력
		String s = sc.nextLine();
		
		// 첫 번째 수를 result에 대입
		long result = s.charAt(0) - '0'; // .charAt(i) - '0' : 문자열 -> 문자 1개 -> 정수형 변환 과정임
		
		for (int i = 1; i < s.length(); i++) {
			// 1번째 인덱스(두 번째 수)를 받아 하나라도 1이하이면 더하기, 2이상이면 곱하기 수행
			int num = s.charAt(i) - '0';
			if( result <= 1 || num <= 1) {
				result += num;
			} else {
				result *= num;
			}
		}
		
		System.out.println(result);
		
	}
}

//1. 두 수 중에서 하나라도 0 또는 1인 경우, 곱하기 보다 더하기를 수행하는 것이 효율적
//2. 두 수에 대해 연산을 수행할 때, 두 수 중에서 하나라도 1 이하인 경우 +
//   두 수 모두 2 이상인 경우 * 연산하면 정답