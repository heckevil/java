package ch05;

public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//�迭( ���� Ÿ���� ������ ������ ����ϱ� ���ϱ� ���� ����ϴ� ��)
		
		int n1 ,n2, n3, n4, n5, n6;
		
		
		//���� ũ�� �з� (������, ������)
		//������: byte short int float long double boolean char  
		//������ : �������� Ÿ��
//		int[] intArr = new int[10]; // 10���� ���濡 ����Ʈ 0���� ������.
//		intArr[0] = 11;
//		intArr[1]=12;
//		intArr[19] = 13;
//		intArr[3] = intArr[19] +4;
		
		String[] strArr = new String[10];
		//��Ÿ��[] �̸� = new ��Ÿ��[�氹��]
		System.out.println("strArr[1] : "+strArr[1]);  
		
		int len=300;
		int[] intArr = new int[len];
		
		int[] intArr2 = {10,20,30};
		//               0   1  2
		for(int i=0; i<3; i++) {
			System.out.printf("intArr[%d] : %d\n",i,intArr2[i]);
		}
		
	}

}
