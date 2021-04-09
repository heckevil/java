package ch05;

public class ArrayMission3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수형 배열 생성 10칸
		// 모든방에 정수값 20을 셋팅

		int[] intArr = new int[10];
		for (int i = 0; i <= 9; i++) {
			intArr[i] = 20;
		}

//		for (int i = 0; i <= 9; i++) {
//
//			System.out.printf("intArr[%d] : %d\n", i, intArr[i]);
//			
			for (int i = 0; i < intArr.length; i++) {

				System.out.printf("intArr[%d] : %d\n", i, intArr[i]);
		}
	}

}
