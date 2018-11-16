package com.biz.arrays.ext;

import java.lang.reflect.Array;

public class Array01 {

	public static void main(String[] args) {
		
		//숫자형 배열은 배열을 선언하면 모든 요소의 값들이 0으로 자동 초기화된다.
		int[] arrNum = new int[10];
		
		for(int i = 0 ; i < arrNum.length ; i ++) {
			System.out.println(arrNum[i]);
		}

		//문자열형 배열은 배열을 선언하면 모든 요소의 값들이 ""으로 초기화 된다.
		//단 sysout..을 사용해서 console에 보이면 null 값으로 편현되는데 실제 null값과는 차이가 있다.
		String[] arrString = new String[10];
		
		for(int i = 0 ; i <arrString.length ; i++) { 		//문자열 배열 요소를 이용해서 문자열 변수의 
			System.out.println(arrString[i]);				//확장기능들(.length())을 사용하려하면 사용할 수 없다.
		}													//따라서 문자열 배열에서 추출한 요소는 어떤 값(문자열)을	
		String s1 = "Republic of Korea";					//저장하기 전에는 읽기 명령을 실행하면 nullpointException이 발생.
				System.out.println(s1.length());
	}
}
