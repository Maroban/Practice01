package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름: ");
		double r = sc.nextDouble();
		System.out.println("구의 부피는: " + ((3.14*r*r*2*r)*2/3) + "입니다.");
		
		
		
		sc.close();

	}

}
