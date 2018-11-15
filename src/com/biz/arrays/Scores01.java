package com.biz.arrays;

public class Scores01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  국어선생님이 어느 반 학생 5명의 국어점수 합계를 계산하고자 한다.
		 	변수를 선언해서 5명 학생의 국어 점수를 저장 해두고 총점을 계산하라
		 */
		
		int intKor1 = 87;
		int intKor2 = 76;
		int intKor3 = 95;
		int intKor4 = 89;
		int intKor5 = 86;
		
		int intSum = intKor1 + intKor2 + intKor3 + intKor4 + intKor5;
		System.out.println(intSum);
		
		
		int Sum = 0;
		for(int i = 0 ; i<50 ; i++) {
			int Kor = (int)(Math.random() * (100 - 50 +1)) + 50;
			Sum += Kor;
			System.out.println((i+1) + "번째 학생의 국어점수는 " + Kor);
		}
		System.out.println("학생들의 국어점수 총점은 : " + Sum);
		System.out.println("국어점수 평균은 : " + Sum / 50);
	}

}
