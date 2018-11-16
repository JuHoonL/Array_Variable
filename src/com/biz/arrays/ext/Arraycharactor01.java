package com.biz.arrays.ext;

public class Arraycharactor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum = (int)(Math.random() * (1000000000 - 10000000 + 1 )) + 10000000 ;
		System.out.println(intNum);
		String strNum = String.valueOf(intNum);
		char[] charNum = strNum.toCharArray();
		
		int intSum = 0;
		for(int i = 0 ; i < charNum.length ; i ++) {	// 해당 숫자를 한글자씩 나눠서 배열에 배치
			System.out.print(charNum[i] + ",");
			int intN = charNum[i] - '0'; 			// char형 문자를 실제 10진수 숫자로 변환시키는 코드
			intSum += intN;
		}
		System.out.println("합계 : " + intSum);
		
		for(int i = 'A' ; i <= 'Z' ; i ++) {
			System.out.print((char)i + ", ");
		}
		System.out.println();
		
		for(int i = 'a' ; i <= 'z' ; i ++) {
			System.out.print((char)i + ", ");
		}
		System.out.println();
		
		for(int i = 'A' ; i <= 'z' ; i ++) {
			System.out.print((char)i + ", ");
		}
		System.out.println();
		
		for(int i = 1 ; i < 256 ; i ++) {
			System.out.print((char)i + ", ");
		}
		System.out.println();
	}

}
