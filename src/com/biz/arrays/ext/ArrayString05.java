package com.biz.arrays.ext;

public class ArrayString05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 임의의 숫자에 각 자리의 수를 합을 구하는 코드
		int intNum = (int)(Math.random() * (1000000000 - 1000000 +1))+ 1000000;
		System.out.println(intNum);
		
		String strNum = String.valueOf(intNum);
		String[] arrNum = strNum.split("");
		
		int intSum = 0;
		for(int i = 0 ; i < arrNum.length ; i ++) {
			intSum += Integer.valueOf(arrNum[i]);
		}
		System.out.println("합계 : " + intSum);
	}

}
