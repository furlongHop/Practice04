package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] intA = {3,6,9};
		
		int[] intB;
		intB = intA;
		intB[0]=20;
		intB[2]=10;
		
		for(int i=0;i<intA.length;i++) {
			System.out.println(intA[i]);
		}

		
		//출력 결과 예상: 20 6 10
		//이유: intA를 먼저 선언했으나 그 후 intB와 intA가 같다는 선언을 했으므로,
		//intA와 다르게 선언한 intB 값들이 intA에 나중에 입력되어 최종값으로 도출된다.
	}

}
