package com.biz.arrays;

public class ScoreArray03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNation = "Repulbic of Korea";
		strNation.length();
				
		int intNum = 0;
		//intNum.
		
		int[] intEng = new int[20];
		int intLength = intEng.length;				// =객체. [getter] , 객체. = [setter]
		// int~.length 배열의 길이(개수)
		
		
		for(int i = 0 ; i<intLength ; i ++) {
			intEng[i] = ConstMethod.makeScore();
		}
		
		int intSum = 0;
		for(int i = 0 ; i < intEng.length ; i++) {
			intSum += intEng[i];
			System.out.printf("%d번째 학생의 영어 점수는 %d이다.\n", i+1, intEng[i]);
		}
		System.out.println("이 반의 총점은 : " + intSum);
	}

}
