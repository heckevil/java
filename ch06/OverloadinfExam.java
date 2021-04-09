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
		//오버로딩 똑같은 이름의 매소드 단 파라미터가 달라야함 (구분이 가능하여야함)
		System.out.println(n1 + n2);
	}
	
	int sum(int n1, int n2, String n3) {
		System.out.println(n1 + n2+ n3);
		return 0;
	}
}