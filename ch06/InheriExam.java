package ch06;

public class InheriExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
//		cat.name = "�����";
//		cat.age = 4;
//		cat.howling();
//		KoShort cat1 = new KoShort();
//		cat1.pee();
		cat.howling();
		
	}

}

class Animal {
	String name;
	int age;

	
	Animal (){}
	public Animal(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
	}

	void howling() {
		System.out.println("���");

	}

}

class Cat extends Animal {
	// �żҵ带 �߰��Ҽ� �־ �θ� �Ӽ��� �����Ҽ� ����
	// �θ� �Ӽ� �ּҷ� ���� �ϰ� �ٸ��� �߰��ϴ� ����
	// �θ�� �ڽ��� ���縦 �𸣱⶧���� �ڽ��� �żҵ带 ��������.

	Cat() {
		super("",0);
		
	} // �⺻������

	void lick() {
		System.out.printf("%s �� �Ӵ�\n", name);// �θ� ����ʵ带 ����ͼ� �����ü� �ִ�.
	}
	@Override//�������̵� ������ @~�� ��������. @�빮�ڽ���
	void howling() { //���� ���̵��� �Ϸ��� �θ��߿� �Ȱ��� �żҵ带 ������ �־�� �Ѵ�. �θ��� �żҵ带 �ڽ��� ������ �ϴ� ����.
		System.out.println("����");
	}

}

class KoShort extends Cat {
	// Cat�κ� animal�� cat�������� lick�� ��� �޴�

	void pee() {
		System.out.printf("%s �� �Һ��� ���� \n", name);// Koshort �� �������� �޼ҵ� �ڽ��� ����Ŀ����.
	}
}

//cat�� ��ġȭ �Ϸ��� Animal���ִ�. cat ��� animal ��üȭ �Ϸ��� Object�� ���� animal��� object ��üȸ -> animal ��üȭ-> cat��üȭ
//������ ȣ��-> cat();���� ���� super();�ڵ����� (super();�ڴ� �ٸ� ��ɾ� ���ٵ� ������ �־���� ) -> ȣ�� animal();ȣ->...-> object();�������� ȣ�ⳡ
// ��ɾ� �ٽ����� ����. ���� ���� object->animal super(); �� ����Ʈ animal->cat super�� print cat
