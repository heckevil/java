package ch06;

public class InstanceExam5 {
	public static void main(String[] args) {

		Car[] carArr = new Car[5]; //ī �迭 ��ü�� ����
		
		Car car1 = new Car(); //ī�迭�� ����
//		
//		System.out.println(carArr[0]); //�迭�� ����Ʈ���� ���� null
//		System.out.println(carArr); //������ ī�迭 ��ü���� �ּҰ��� ����������
		
//  	carArr[0].name="�׷���"; = ���� ���� carArr[0]�� �ΰ��� �⺻���̹Ƿ�(�ּ�X) ��ü�� �ƴϹǷ� ��üȭ �� �� ����
		carArr[0] = new Car(); //��üȭ ��Ų�� 
		carArr[0].name = "�׷���"; // ��ü  �Ӽ� ����
		System.out.println();   //�ҹ��� ���ͳΰ�, �빮�� �ּҰ�
		
	}

}

