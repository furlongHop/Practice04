package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		char c[]= {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}
		
		System.out.println("");
		
		
		char[] C;
		C=c; //순서 주의! C가 목표임!
		C[4]=',';
		C[7]=',';
		C[9]=',';
		//0부터 시작하는 것 잊지 말기!
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}
		
		
	}

}
