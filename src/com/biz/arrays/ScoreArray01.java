package com.biz.arrays;

public class ScoreArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 한반에 학생이 10명이라고 가정
		int intClassCount = 10;
		
		// 시험을 보기전(아직점수가없다)에 성적처리 프로그램을 미리(!) 만들고있다 
		int[] intKor = {0,0,0,0,0,0,0,0,0,0};
		int[] intEng = new int[intClassCount];		// 배열의 데이터 개수를 지정해줌
		int[] intMth = new int[intClassCount];
		int[] intSci = new int[intClassCount];
		
		intKor[0] = 90;
		intKor[1] = 91;
		intKor[2] = 92;
		intKor[3] = 93;
		intKor[4] = 94;
		intKor[5] = 95;
		intKor[6] = 96;
		intKor[7] = 97;
		intKor[8] = 98;
		intKor[9] = 99;
		
		System.out.println(intKor[6]);
		
		for(int i = 0 ; i <10 ; i++) {
			System.out.println((i+1) + "번째 학생점수 " + intKor[i]);
		}
		
		
		
		
	}

}
