package ch06;

public class CapsuleExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h1 = new Human();

		// ���̴� 12, �̸��� ȫ�浿

		h1.setAge(12);
		h1.setName("ȫ�浿");

		Human h2 = new Human();
		h2.setAge(20);
		h2.setName("�Ż��Ӵ�");

		h1.whoAmI();
		h2.whoAmI();

	}

}

class Human {
	private int age;
	private String name; 
	// ĸ��ȭ�� ����ʵ� ������ private���δ�.
//�����̺� ����ʵ忡 ���� ���״� ����� : 
	// �żҵ� : setter(������), getter(�����¹�)
	// ��� �ʵ忡 �����̺��� ������ϴµ� ���൵ �Ǵ� ������ �� = ���

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void whoAmI() {
		System.out.printf("���̸��� %s, ���̴� %d �Դϴ�.\n", name, age);
	}

//		if(name != null) {
//			this.name = name;
//		} else {name = "�̻�";}
//
//		if(age != null) {
//			this.age = age;
//		} else {age = 10;}
	

	Human() {
		this(10);
	}

	Human(int age) {
		this("�̻�", age);
	}

	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	Human(String name) {
		this(name, 10);
	}

}


// ������
