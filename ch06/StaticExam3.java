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

class CalcStatic { // ��������� �޸𸮿� �ø��°� �ٽ�. ����ƽ�� ������ ������ �޸𸮿� �ö�����< ��üȭ �ʿ� X Ŭ������.�Ӽ����� �ٷ�����
	static int sum(int num1, int num2) {
		return num1 + num2;
	}
}

class CalcInstance {// �޸𸮿� �ȿö����� �޸𸮿� �ø��� �۾��� �ʿ� = ��üȭ(�ν��Ͻ���� ��)
	int sum(int num1, int num2) {
		return num1 + num2;
	}
}
