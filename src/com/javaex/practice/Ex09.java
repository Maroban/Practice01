package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		double f = 80.0;
		System.out.println(5.0/9*(f-32));
		
		// 5/9를 하면 0.5555인데 int로 변환되어 0이 나옴. 결국 0 * (f-32) 인 셈

	}

}
