package com.biz.arrays.ext;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  배열을 생성(선언과 초기화를 같이하는 것)
		 1. 개수를 직접 지정하는 방법
		 2. 데이터를 나열해서 생성하는 방법
		 3. 선언만 하고 다시 초기화하는 방법
		 4. method를 이용해서 return 값으로 생성하는  방법
		 */
		
		String[] arrStr1 = new String[10];
		String[] arrStr2 = {"대한민국", "우리나라"};
		String[] arrStr3 ;
		arrStr3 = new String[3];
		
		String[] arrStr4 ;
		arrStr4 = new String[] {"우리나라", "대한민국"};
		
		String[] arrStr5;
		arrStr5 = makeStrings();
		
		int[] arrI = makeInteger();
		for(int i = 0 ; i < arrI.length ; i ++) {
			System.out.println(arrI[i]);
		}
	}

	public static String[] makeStrings() {
		return new String[10];
	}
	
	public static int[] makeInteger() {
		int[] arrInt = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
		return arrInt;
	}
}