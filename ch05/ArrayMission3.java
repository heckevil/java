package ch05;

public class ArrayMission3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ �迭 ���� 10ĭ
		// ���濡 ������ 20�� ����

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
