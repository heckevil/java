package ch05;

import java.util.Arrays;

public class ArrayshortExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {88, 65, 23, 1, 900, 42, 95};
		
		int temp =arr [1]; // 1번방 65 저장
		
		arr[1] = arr[0]; //0번방을 1번방으로 불러온후
		arr[0]= temp; //temp에 저장한 1번방 값을 불러온다
				
		System.out.println(Arrays.toString(arr));
	}

}
