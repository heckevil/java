package ch05;

public class MethodExam2 {
	public static void main (String[] args) {
		int n1= 10, n2=30;
		voidsum(n1,n2);//�żҵ常 �ҷ��ͼ� ���� �Է��� ������ص� ����̵�
		
		voidsum (1,2);//���̵��� ��� �ҼӵǾ� ������ �ȴ�
		System.out.println("----------");
		int result = intsum(n1,n2); // ���̵����� ��� �ҼӰ��� �� ��� Ÿ���� �޼ҵ�� ���ƾ���
		System.out.println("result-1 : "+result);
		result = intsum(1,2);
		System.out.println("result-2 : "+result);
		
		for(int i=0; i<100; i++) {
			hello();
		}
	}
	public static void voidsum(int n1, int n2) {
		System.out.printf("%d + %d = %d \n",n1,n2,(n1+n2));//�żҵ忡 ����Ʈ�� ����
		//����Ÿ�� : void, ��void
		//�Ķ���� : O.X
		
	}
	public static void hello () {
		System.out.println("�ȳ��ϼ���!"); //�Ķ���͵� ����, ���̵���
	}
	
	public static int intsum(int n1, int n2) {
		return n1 + n2;
		}
	}
