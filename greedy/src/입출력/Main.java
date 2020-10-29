package 입출력;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n-1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i*2-1; j++) {
				if(j % n*i == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
