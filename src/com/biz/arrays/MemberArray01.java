package com.biz.arrays;

public class MemberArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberVO[] arrMem = new MemberVO[10];
		
		arrMem[0] = new MemberVO();				// String의 경우 class내의 변수를 쓰려면 초기화를 다시해줘야함 (각각 따로)
		arrMem[0].strName = "홍길동";
		arrMem[0].strTel = "001-123-245";
		arrMem[0].strAddr = "광주광역시";
		
		String[] arrString = new String[10];
		arrString[0] = "Korea";					// String의 경우 class내의 변수를 쓰려면 초기화를 다시해줘야함 (각각 따로)
		arrString[1] = new String();			// String의 경우 class내의 변수를 쓰려면 초기화를 다시해줘야함 (각각 따로)
		arrString[2] = "";						// String의 경우 class내의 변수를 쓰려면 초기화를 다시해줘야함 (각각 따로)

		int[] n = new int[19];
		
		System.out.println(n);					// n의 값(배열)이 들어있는 파일의 위치를 16진수도 변환하여 표시
		System.out.println(n[0]);
		
		/*
		int n1 ;
		n1 = n;			=>  오류 (일반 int값 변수X)
		n1 = n[0];		=>  정상표시
		*/
	}

}
