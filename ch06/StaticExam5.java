package ch06;

public class StaticExam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticExam5 sum = new StaticExam5();
		sum.n1 = 10;
		sum.n2 = 20;
		int result = sum.plus();
		System.out.println(result);
		
		
	}
	int n1;
	int n2;
	public int plus () {
		return n1 +n2;
	}
}
