package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] mean = new int[5];
		double sum =0;
		
		for(int i=0;i<mean.length;i++) {
			mean[i]=sc.nextInt();
			sum=sum+mean[i];
		}
		
		System.out.println("평균은 "+sum/5+" 입니다.");
		
		sc.close();
	
		

	}

}
