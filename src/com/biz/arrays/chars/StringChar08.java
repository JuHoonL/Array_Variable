package com.biz.arrays.chars;

public class StringChar08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNation = "Republic of Korea";
		
		//문자열을 문자 배열로
		char[] charNation = strNation.toCharArray();
		char[] charR = new char[charNation.length];
		
		//문자 배열을 역순으로 재 배열
		int intLen = charNation.length;
		for(char c : charNation) {
			charR[--intLen] = c;
		}
		
		char[] secText = new char[charNation.length];
		//원본 문자열과 거꾸로 뒤집은 문자열을 각각 XOR연산을 수행하여 secText배열에 저장
		for(int i = 0 ; i < charNation.length ; i ++) {
			char charXOR = (char)(charNation[i] ^ charR[i]);	// 배타적OR연산 : 같은땐 0 다를땐 1 (이진법에서) => ^ 연산자사용
			secText[i] = charXOR;
		}
		//암호화 된 문자열 보기
		String strTemp = new String(secText,0,secText.length);
		System.out.println(strTemp);
		
		//XOR를 이용해서 원문 복원(복호화)
		char[] norText = new char[charNation.length];
		for(int i = 0 ; i < charNation.length ; i ++) {
			char charXOR = (char)(secText[i] ^ charR[i]);	// 배타적OR연산 : 같은땐 0 다를땐 1 (이진법에서) => ^ 연산자사용
			norText[i] = charXOR;
		}
		strTemp = new String(norText,0,norText.length);
		System.out.println(strTemp);
		
	}

}
