package ch06;

public class CapsuleExam {

	public static void main(String[] args) {
		Human h1 = new Human(); // name: �̻� ,age : 10
		Human h2 = new Human("�򰭰���"); // name:�򰭰��� age :10
		Human h3 = new Human("�̼���", 20);// name:�̼��� ,20
		Human h4 = new Human(30);// name:�̻�, ���̴� 30

		h1.whoAmI();
		h2.whoAmI();
		h3.whoAmI();
		h4.whoAmI();

	}
}

// ������
