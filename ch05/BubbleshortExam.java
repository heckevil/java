package ch05;

import java.util.Arrays;

public class BubbleshortExam {

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
		
		int[] arr = {8,7,3,1,6,0};
		for(int i=0; i<arr.length-1; i++) {
			int minIdx =1;
			for(int z=i+1; z<arr.length; z++) {
				if(arr[minIdx] > arr[z]) {
					mindIdx=z;	
				}
			}
			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
			
		}
			}
		}
	}

}
