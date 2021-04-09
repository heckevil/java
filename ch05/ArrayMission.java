package ch05;

public class ArrayMission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수형 배열 생성 10칸
		// 1~10값이 순차적 대입
		// 각방의 값을 콘솔출력
		// 입력과 출력은 분리

		int[] intArr = new int[10];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = i + 1;
		}
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}

}
