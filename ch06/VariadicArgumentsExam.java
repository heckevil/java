package ch06;

public class VariadicArgumentsExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc2 calc2 = new Calc2();
		int result = calc2.sum (new int[] {10,20});
		System.out.println(result);
		result =calc2.sum (10, 20,30);
		System.out.println(result);
		result =calc2.sum (10, 20,30,40);
		System.out.println(result);
		result =calc2.sum (10, 20,30,50,40);
		System.out.println(result);
		
	}

}

class Calc2{
	int sum(int...vals) { //����(��������) : ��� ���ڸ� �迭�� ���� ����ŷ
		int sum = 0;
		for (int i=0; i <vals.length;i++) {
			sum +=vals[i];
		}
		
		return sum;
	}
}