package ch06;

public class AccessExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		-private : private�� ������ �ִ� Ŭ���� �ȿ����� �����Ҽ� �ִ�.
		-default(�ʱⰪ) : ���� ��Ű�� �ȿ������� ȣ�� ���� 
		
		
		
		
//		����    private default protected public
//		class    O       O        O       O     
//		��Ű��    X       O        O        O
//		��Ӱ���  X       X         O       O
//		��ü     X       X         X       X 
		Accese acc = new Accese();
		acc.num = 10; //private�� ������ �ִ� ���������� ������������ ���Ұ�
		
		
	}

}


class Accese {
	
	private int num;
	
	void printNum() {
		System.out.println("num : "+num);//���� Ŭ���� �ȿ��� ���ٰ���
	}
	
} 
