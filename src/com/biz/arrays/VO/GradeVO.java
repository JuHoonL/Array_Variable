package com.biz.arrays.VO;

public class GradeVO {
	/*
	  VO : 확장된 변수개념(DTO)
	  DAO : VO -> DataBase && VO <- DataBase 중간자역할
	  Service
	  
	  Data입력 => VO => Service(가공) => Data저장 => DAO읽기 => VO담기 => Service => Data 출력
	 */
	
	private String strNum;
	private int intKor;
	private int intEng;
	private int intMth;
	private int intSci;
	
	private int intSum;
	private float floatAvg;

	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMth() {
		return intMth;
	}
	public void setIntMth(int intMth) {
		this.intMth = intMth;
	}
	public int getIntSci() {
		return intSci;
	}
	public void setIntSci(int intSci) {
		this.intSci = intSci;
	}
	public int getIntSum() {
		return intSum;
	}
	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}
	public float getFloatAvg() {
		return floatAvg;
	}
	public void setFloatAvg(float floatAvg) {
		this.floatAvg = floatAvg;
	}
}
