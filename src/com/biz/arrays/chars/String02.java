package com.biz.arrays.chars;

public class String02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strName = "홍길동";
		System.out.println(strName.hashCode()); 	// 54150062
		
		strName = "이몽룡";
		System.out.println(strName.hashCode());		// 50597944
		// 서로다른 주소에 저장된 것을 알수있다 => 처음 지정한 공간에 다른 것을 넣는게 아니라 다른곳에 새로 지정하여 그곳의 주소를 strName에 연결해주는 방식
		
		
	}

}
