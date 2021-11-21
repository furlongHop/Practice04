package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		intArray[0]=3;
		intArray[1]=7;
		intArray[2]=12;

		
		int result = 0;
		
		for(int i=0;i<intArray.length;i++) {
			result=result+intArray[i];
		}
		System.out.println(result);
		
		/*
		원인: i<=intArray.length(intArray 길이=5)로 조건식을 둘 경우 i는 0부터 시작하므로 0,1,2,3,4,5
		총 6개가 되는데 int[]는 총 5개이므로 오류가 난다.
		따라서 이 오류는 i도 5개가 되도록 조건식을 조정해주면 해결된다.
		*/
	}

}
