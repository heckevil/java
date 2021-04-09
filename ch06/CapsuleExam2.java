package ch06;

public class CapsuleExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h1 = new Human();

		// 나이는 12, 이름은 홍길동

		h1.setAge(12);
		h1.setName("홍길동");

		Human h2 = new Human();
		h2.setAge(20);
		h2.setName("신사임당");

		h1.whoAmI();
		h2.whoAmI();

	}

}

class Human {
	private int age;
	private String name; 
	// 캡슐화는 멤버필드 무조건 private붙인다.
//프라이빗 멤버필드에 값을 빼네는 방법은 : 
	// 매소드 : setter(넣을때), getter(빼내는법)
	// 멤버 필드에 프라이빗을 꼭줘야하는데 안줘도 되느 유일한 값 = 상수

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
		System.out.printf("제이름은 %s, 나이는 %d 입니다.\n", name, age);
	}

//		if(name != null) {
//			this.name = name;
//		} else {name = "미상";}
//
//		if(age != null) {
//			this.age = age;
//		} else {age = 10;}
	

	Human() {
		this(10);
	}

	Human(int age) {
		this("미상", age);
	}

	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	Human(String name) {
		this(name, 10);
	}

}


// 생성자
