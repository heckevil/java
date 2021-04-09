package ch05;

import java.util.Arrays;

public class BubbleshortExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,7,3,1,6};
		
		
		// 7 8 3 1 6 0번1번 비교해서 작은수 앞으로
		// 7 3 8 1 6  1번 2번
		// 7 3 1 8 6 2번 3번     비교할떄 오른쪽의 수가 더작으면 스와핑
		// 7 3 1 6 8
		
//		3 7 1 6 8
//		3 1 7 6 8
//		3 1 6 7 8
//		
//		1 3 6 7 8 오른쪽 숫자랑 비교해서 오른쪽 숫자가 작으면 스와핑 아니면 가만히 둔다 한줄다 끝나면
		// 다시 처음부터 왼쪽에서 시작
		
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
