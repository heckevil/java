package ch05;

public class ArrayMission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ �迭 ���� 10ĭ
		// 1~10���� ������ ����
		// ������ ���� �ܼ����
		// �Է°� ����� �и�

		int[] intArr = new int[10];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = i + 1;
		}
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}

}
