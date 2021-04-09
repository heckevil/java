package ch06;

public class StaticExam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CalcIntstance2 객체화
		// num1=10 ,num2=20;
		// 더한값을 콘솔에 출력

		CalcInstance2 calc2 = new CalcInstance2();
		calc2.num1 = 20;
		calc2.num2 = 20;
		int result = calc2.sum();
		System.out.println(result);

		CalcStatic2.num1 = 40;
		CalcStatic2.num2 = 40;
		int result2 = CalcStatic2.sum();
		System.out.println(result2);

		String.format("%d", result);
	}

}

class CalcStatic2 { // 쓰고싶은건 메모리에 올리는게 핵심. 스태틱이 붙으면 무조건 메모리에 올라가있음< 개체화 필요 X 클래스명.속성으로 바로접근

	int num1;
	int num2;

	int sum() {
		return num1 + num2;
	}
}

class CalcInstance2 {// 메모리에 안올라가있음 메모리에 올리는 작업이 필요 = 객체화(인스턴스라고도 함)

	int num1;
	int num2;

	int sum() {
		return this.num1 + this.num2;
	}
}