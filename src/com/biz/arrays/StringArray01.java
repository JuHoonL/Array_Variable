package com.biz.arrays;

public class StringArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strNation = {
				"KOREA",
				"대한민국",
				"우리나라",
				"REPUBLIC OF KOREA"
		};
		
		String[] strNation2 = new String[5];
		strNation2[0] = "korea";
		strNation2[1] = "대한민국";
		strNation2[2] = "우리나라";
		strNation2[3] = "Republic of korea";
		
		String[] strS1 = new String[10];
		System.out.println(strS1.length);
		//System.out.println(strS1[0].length());
		
		int[] intN1 = new int[10];
		System.out.println(intN1[5]);
	}

}
