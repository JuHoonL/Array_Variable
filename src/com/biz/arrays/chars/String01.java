package com.biz.arrays.chars;

public class String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strName1 = "홍길동";
		String strName2 = "홍길동";
		
		// 서로 다른 변수를 지정하고 같은 값으로 초기화(지정, 저장)해도 저장된 장소가 같은 주소로 나옴
		System.out.println(strName1.hashCode());	// hashCode : 객체의 메모리주소를 나타내주는 명령어
		System.out.println(strName2.hashCode());
		
		// 문자열의 메모리주소가 같다를 물어보는 것이므로 어떤 떄는 같고 어떤떄는 다르다 특히 자바 버전에 따라 그 결과가 완전히 다르다
		if(strName1 == strName2) { 	 
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		//문자열 변수에 저장된 내용을 비교하여 물어볼때는 equals를 사용해야함.
		if(strName1.equals(strName2)){
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}

}
