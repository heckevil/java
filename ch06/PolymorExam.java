package ch06;

public class PolymorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�޼ҵ� ���� �پ缺
		// 1. �θ� Ÿ���� ������ �ڽİ�ü ����ų �� �ִ�.
		// 2. �θ�Ÿ���� ������ �θ� ��ü ����ų �� ����.
		// # �ڽ��� Ÿ�� ��ü�� �ڽ��� Ÿ�� ��ü�� ����ų�� �ִ�.
		// 3. Ÿ���� �ƴ� �޼ҵ常 ȣ���Ҽ� �ִ�.
		//  ȣ���� �Ǿ��ٸ� ������ ��ü�̴�.
		
		Animal ani_1 = new Cat(); //1.
		System.out.println("1.��");
		
		//Cat cat1 = new Animal(); //2. �������� �ȴ�
		
		
		//Cat cat = ani_1;// 3. Ȥ�ó� 2���ϱ�� �����Ϸ��� �ַ� ��Ʈ��
		Cat cat = (Cat)ani_1;//cat���� ���� ����ȯ
		
		ani_1.howling();//�Ŀ� ��������, ȣǮ�� �ߵǾ��ٸ� ������ ��ü���� Cat�� �ȴ�.
		cat.howling(); //������ü���� ���Ա⋚�� ������ ����
		ani_1.lick();//animal �ڽ��� �߰��� �޼ҵ带 �𸥴�.
		
	}

}
