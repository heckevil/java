package ch06;

public class InstanceExam2 {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		dog d1 = new dog();
		dog d2 = d1; // ��ü�� ������ ������� new�� ������ ���;���
		//d1, d2 �� �ϳ��� ��ü�� ����Ŵ
		
		
		d1.name = "�ǻ�";
		d2.name = "����";
		
		d1.bark();
		

	}
}