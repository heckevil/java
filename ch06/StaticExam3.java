package ch06;

public class StaticExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcInstance ci = new CalcInstance();
		int result = ci.sum(10, 20);
		System.out.println(result);
		
		CalcStatic.sum(10, 20);
		
		
		
	}
}

class CalcStatic { // 쓰고싶은건 메모리에 올리는게 핵심. 스태틱이 붙으면 무조건 메모리에 올라가있음< 개체화 필요 X 클래스명.속성으로 바로접근
	static int sum(int num1, int num2) {
		return num1 + num2;
	}
}

class CalcInstance {// 메모리에 안올라가있음 메모리에 올리는 작업이 필요 = 객체화(인스턴스라고도 함)
	int sum(int num1, int num2) {
		return num1 + num2;
	}
}
