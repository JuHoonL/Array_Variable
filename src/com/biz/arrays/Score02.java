package com.biz.arrays;

public class Score02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intKor = {
				88,
				87,
				98,
				78,
				95,
				76
		};
		
		int[] intEng = {88,74,63,55,33,65,66};		// 배열 : [] 많다라는, {} 그룹묶음
		System.out.println(intEng[3]);
		System.out.println(intEng[0]);
		System.out.println(intKor[5]);
		/*
		  배열에 저장된 데이터의 갯수(범위)내에서만 가능 => 벗어나면 오류
			예>intKor에 저장된 데이터 갯수 6개 => intKor[5] (O), intKor[7] (X)  
		   	 	=> Array Index Out of Bound 오류(Exception)이 발생
		 */
		
		
	}

}
