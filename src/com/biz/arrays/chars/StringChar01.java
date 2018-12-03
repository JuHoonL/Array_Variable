package com.biz.arrays.chars;

public class StringChar01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strText = "나는 자랑스런 태극기 앞에 ";
		strText += "자유롭고 정의로운 대한민국의 " ;
		strText += "무궁한 영광을 위하여 충성을";
		strText += "다 할 것을 굳게 다짐합니다.";
		
		int lenText = strText.length();
		String[] strSpace = strText.split(" ");
		String[] strChar = strText.split("");
		 
		//배열은 정수형변수를 사용해서 내용을 읽기 쓰기 가능하며 
		System.out.println(strText);
		for(int i = 0 ; i < strSpace.length ; i ++ ) {
			System.out.print(strSpace[i]); 			// [i]는 배열의 주소나 배열의 첨자라고 부름 보통 첨자라고 함.
		}
		//직접 정수를 사용해서 내용을 읽기 쓰기 실행할 수도 있다.
		System.out.print(strSpace[0]);
		System.out.print(strSpace[1]);
		System.out.print(strSpace[2]);
		System.out.print(strSpace[3]);
		
		
		for(String s : strSpace) {
			System.out.println(s);
		}
		
	}

}
