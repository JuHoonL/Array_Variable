package com.biz.arrays;

public class ScoreArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intKor = new int[20];
		int intNum = 20;
				
		for(int i = 0 ; i<intNum ; i++) {
			intKor[i] = ConstMethod.makeScore();
		}
		
		for(int i = 0 ; i < intNum ; i++) {
		}

		int intSum = 0;
		for(int i = 0 ; i < intNum ; i++) {
			intSum += intKor[i];
			System.out.printf("%d번 학생 국어점수 : %d\n", i+1, intKor[i]);
		}
		System.out.println("===========================");
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + (float)intSum/intNum);
		System.out.println("===========================");
		
	}
	public static int makeScore() {
		return (int)(Math.random() * (100 -50 +1))+50;
	}
	
}
