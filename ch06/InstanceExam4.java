package ch06;

public class InstanceExam4 {
	public static void main(String[] args) {

//		�� �ΰ� ��äȭ
//		ù��° ���� name : �ҳ�Ÿ cc: 2000
//		�ι�¹ ���� name�� 911 cc: 5000
//		ù��° ���� drive
//		ù��° ���� stop
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.name = "�ҳ�Ÿ";
		car1.CC = 2000;
		car1.stop();
		car1.drive();
		
		car2.name = "911";
		car2.CC = 5000;
		
	}

}

class Car {
	String name;
	int CC;

	void drive() {
		System.out.printf("%s�� �޸���.\n",name);
	}

	void stop() {
		System.out.printf("%s�� �����.\n",name);
	}
}
