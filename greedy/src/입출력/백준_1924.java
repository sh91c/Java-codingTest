package 입출력;

import java.util.*;
import java.io.*;

public class 백준_1924 { // 2007년 요일 구하기

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30 ,31 ,30, 31};
		String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		int m = in.nextInt();
		int d = in.nextInt();
		
		int day = 0;
		
		for (int i = 1; i < m; i++) {
			// 3월 2일의 요일을 구한다면? 2월까지 모든 일 수 더하기
			day += month[i];
		}
		
		// (2월까지 모든 일 수 더하기 + 2일)을 7로 나눈 나머지 값이 해당 요일이 된다.
		day = (day + d) % 7;
		
		System.out.println(week[day]);
	}
}
