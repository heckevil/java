package ch05;

public class MeThodExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = sum (10 , 20); //���⼭ �޼ҵ带 �ҷ��´�
		//				 �ȿ��� ���Ǹ� �ϸ� �ȵǰ� ���� ��������
		// (int =a, int =b) XXX
		System.out.println("result : " + result);
		
		int result2 = minus( 50, 30 );
		System.out.println("result2 : " + result2);

	}
	public static int sum(int n1, int n2) { //�޼ҵ� �ȿ� �޼ҵ� �ϸ� �ȴ�!
		//        ������ ���� Ÿ���� �� ����    �޼ҵ带 �����Ѵ�
		return n1 + n2;
		// n1+n2 ���� ������ ȣ���� ������ ���ư���.
	}
	public static int minus(int n1, int n2) {
		return n1 - n2;
	}
	
}
