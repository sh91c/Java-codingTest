package greedy;

import java.util.*;

public class ex06_만들수없는금액_방법2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			al.add(sc.nextInt());
		}
		
		Collections.sort(al);
		
		int target = 1;
		for (int i = 0; i < n; i++) {
			// 만들 수 없는 금액을 찾았을 때 반복 종료
			// 오름차순으로 정렬했으니 첫번째 인덱스가 1이면 반복문 탈출
			if(target < al.get(i))	break;
			target += al.get(i);
		}
		System.out.println(target);
	}

}
