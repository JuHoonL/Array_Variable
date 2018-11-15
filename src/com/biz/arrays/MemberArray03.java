package com.biz.arrays;

public class MemberArray03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberVO[] arrVO = new MemberVO[100];
		for(int i = 0 ; i < arrVO.length ; i++) {		// 한번에 모든 arrVO[]를 초기화해줌
			arrVO[i] = new MemberVO();
		}

		for(int i = 0 ; i < arrVO.length ; i++) {
			System.out.println(arrVO[i]); 				
	// System.out.println(arrVO[i]) => arrVO(상위폴더)의 할당된 기억장소에서 i만큼의 기억장소(하위폴더)를 그속에 할당
		}
	}

}
