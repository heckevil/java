package ch06;

public class PolymorMissoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		Pig pig = new Pig();
		Hamster Hamster = new Hamster();
		Lion lion = new Lion();

		cry(cat);
		cry(pig);
		cry(Hamster);
		cry(lion);
	}

	static void cry(Animal name) {
		name.howling(); //animal Ÿ���� howling �� ���ڴ�. �׳����� ��ü�� name�� �޷ȴ�.
	}

	static void cry(Lion lion) {
		lion.howling();
	}

}

class Pig extends Animal {
	@Override
	void howling() {
		System.out.println("�ܲ�");
	}
}

class Hamster extends Animal {
	@Override
	void howling() {
		System.out.println("����");
	}
}

class Lion {
	void howling() {
		System.out.println("������");
	}

}
