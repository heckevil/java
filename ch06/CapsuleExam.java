package ch06;

public class CapsuleExam {

	public static void main(String[] args) {
		Human h1 = new Human(); // name: 미상 ,age : 10
		Human h2 = new Human("평강공주"); // name:평강공주 age :10
		Human h3 = new Human("이순신", 20);// name:이순신 ,20
		Human h4 = new Human(30);// name:미상, 나이는 30

		h1.whoAmI();
		h2.whoAmI();
		h3.whoAmI();
		h4.whoAmI();

	}
}

// 생성자
