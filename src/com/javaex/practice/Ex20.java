package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 500;
		int b = 100;
		int c = 50;
		int d = 10;
		
		
		
		
		System.out.print("500원 개수:  ");
		int c500 = sc.nextInt();
		System.out.print("100원 개수:  ");
		int c100 = sc.nextInt();
		System.out.print("50원 개수:  ");
		int c50 = sc.nextInt();
		System.out.print("10원 개수:  ");
		int c10 = sc.nextInt();
		System.out.println("동전의 총합은 " + (c500*a + c100*b + c50*c + c10*d) + "원 입니다.");
		
		
		
		sc.close();

	}

}
