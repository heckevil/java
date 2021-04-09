package ch06;

public class InstanceExam4 {
	public static void main(String[] args) {

//		차 두개 객채화
//		첫번째 차량 name : 소나타 cc: 2000
//		두번쨔 차는 name은 911 cc: 5000
//		첫번째 차량 drive
//		첫번째 차량 stop
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.name = "소나타";
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
		System.out.printf("%s는 달린다.\n",name);
	}

	void stop() {
		System.out.printf("%s는 멈춘다.\n",name);
	}
}
