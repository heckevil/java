package ch05;

import java.util.Arrays;

public class ArrayshortExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {88, 65, 23, 1, 900, 42, 95};
		
		int temp =arr [1]; // 1���� 65 ����
		
		arr[1] = arr[0]; //0������ 1�������� �ҷ�����
		arr[0]= temp; //temp�� ������ 1���� ���� �ҷ��´�
				
		System.out.println(Arrays.toString(arr));
	}

}
