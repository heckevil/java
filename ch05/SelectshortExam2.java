package ch05;

import java.util.Arrays;

public class SelectshortExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,7,3,1,6};
		
		
		// 7 8 3 1 6 0��1�� ���ؼ� ������ ������
		// 7 3 8 1 6  1�� 2��
		// 7 3 1 8 6 2�� 3��     ���ҋ� �������� ���� �������� ������
		// 7 3 1 6 8
		
//		3 7 1 6 8
//		3 1 7 6 8
//		3 1 6 7 8
//		
//		1 3 6 7 8 ������ ���ڶ� ���ؼ� ������ ���ڰ� ������ ������ �ƴϸ� ������ �д� ���ٴ� ������
		// �ٽ� ó������ ���ʿ��� ����
		
		for(int i =arr.length -1; i>0;i--) {
			for(int z=0; z<i; z++) {
				if(arr[z] > arr[z+1]) {
					int temp = arr[z];
					arr[z] = arr[z+1];
					arr[z+1] = temp; 
				}
		System.out.println(Arrays.toString(arr));
		
			}
		}
	}

}
