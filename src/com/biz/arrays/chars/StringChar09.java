package com.biz.arrays.chars;

public class StringChar09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNation = "Republic of Korea";
		
		//문자열을 배열로 생성
		//1. 문자열 배열로 생성
		String[] arrnation = strNation.split("");
		//2. char형 배열로 생성
		char[] charNation = strNation.toCharArray();
		//배열을 콘솔에 나열하는 방법
		for(int i = 0 ; i < arrnation.length ; i ++) {
			System.out.print(arrnation[i]+10); // 문자열의 경우 10을 + 주면 R10, e10, p10,..., e10, a10 식으로 출력
			System.out.print(", ");
		}
		System.out.println();
		
		for(int i = 0 ; i < charNation.length ;i ++) {
			System.out.print(charNation[i]+10); 
			// char의 경우 10을 + 주면 92, 111, 122, .., 111, 107 출력 / 정수와 함께 연산수행시 자동으로 int형으로 변환되어 연산됌
			System.out.print(", ");
		}
		System.out.println();
		
		for(int i = 0 ; i < charNation.length ;i ++) {
			System.out.print(charNation[i]+'A'); 
			// char의 경우 문자'A'을 + 주면147, 166, 177, ..,  166, 162 출력 / 문자'A'와 함께 연산수행시 자동으로 둘다 모두 int형(ASCII코드)으로 변환되어 연산됌
			System.out.print(", ");
		}
		System.out.println();
		
		/*
		 * char +(-) char : int형 코드 +(-) int형 코드
		 * 이 원리를 이용해서 원래(원본, PlanText)에 키값을 연산 수행하여 암호화된 Text로 변환하는 기법 
		 */
		
		
	}

}
