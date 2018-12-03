package com.biz.arrays.chars;

public class StringChar07 {
	
	/*
	 * 문자열 strNation을 char 배열로 바꾼 후 문자열을 거꾸로 콘솔에 출력하시오
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNation = "Republic of Korea";
		
		
		char[] charNation = strNation.toCharArray();
		int textLength = charNation.length;
		
/*		for(int i = textLength-1 ; i >= 0 ; i--) {
			System.out.print((char)charNation[i] + ", ");
		}
*/		
		System.out.println();
		
		char[] charReNation = new char[textLength];
		for(char c : charNation) {
			charReNation[--textLength] = c ;
		}
		
		for(int i = 0 ; i < textLength ; i++) {
			int intR = textLength - i - 1 ;
			charReNation[intR] = charNation[i];
		}
		
		for(int i : charReNation) {
			System.out.print((char)i + ", ");
		}
		
		System.out.println();
		String strRNation = new String(charReNation, 0,charReNation.length);
	}

}
