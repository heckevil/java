package ch06;

public class OverloadinfExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc clac = new Calc();
		clac.sum(5, 10);
		clac.sum(5,10,"30");
	}

}

class Calc {
	void sum(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	void sum(int n1, int n2, int n3) {
		//�����ε� �Ȱ��� �̸��� �żҵ� �� �Ķ���Ͱ� �޶���� (������ �����Ͽ�����)
		System.out.println(n1 + n2);
	}
	
	int sum(int n1, int n2, String n3) {
		System.out.println(n1 + n2+ n3);
		return 0;
	}
}