package ch06;

public class StaticExam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CalcIntstance2 ��üȭ
		// num1=10 ,num2=20;
		// ���Ѱ��� �ֿܼ� ���

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

class CalcStatic2 { // ��������� �޸𸮿� �ø��°� �ٽ�. ����ƽ�� ������ ������ �޸𸮿� �ö�����< ��üȭ �ʿ� X Ŭ������.�Ӽ����� �ٷ�����

	int num1;
	int num2;

	int sum() {
		return num1 + num2;
	}
}

class CalcInstance2 {// �޸𸮿� �ȿö����� �޸𸮿� �ø��� �۾��� �ʿ� = ��üȭ(�ν��Ͻ���� ��)

	int num1;
	int num2;

	int sum() {
		return this.num1 + this.num2;
	}
}