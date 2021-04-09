package ch06;

public class InheriExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
//		cat.name = "고양이";
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
		System.out.println("운다");

	}

}

class Cat extends Animal {
	// 매소드를 추가할순 있어도 부모 속성을 수정할순 없다
	// 부모 속성 최소로 고정 하고 다른걸 추가하는 개념
	// 부모는 자식의 존재를 모르기때문에 자식의 매소드를 쓸수없다.

	Cat() {
		super("",0);
		
	} // 기본생성자

	void lick() {
		System.out.printf("%s 가 핥다\n", name);// 부모 멤버필드를 끌어와서 가져올수 있다.
	}
	@Override//오버라이딩 했을때 @~를 꼭해주자. @대문자시작
	void howling() { //오버 라이딩을 하려면 부모중에 똑같은 매소드를 가지고 있어야 한다. 부모의 매소드를 자식이 재정의 하는 원리.
		System.out.println("나용");
	}

}

class KoShort extends Cat {
	// Cat부보 animal과 cat독자적인 lick도 상속 받다

	void pee() {
		System.out.printf("%s 가 소변을 본다 \n", name);// Koshort 의 독자적인 메소드 자식이 점점커진다.
	}
}

//cat을 객치화 하려니 Animal이있다. cat 대기 animal 객체화 하려니 Object가 있음 animal대기 object 객체회 -> animal 객체화-> cat객체화
//생성자 호출-> cat();에서 시작 super();자동생성 (super();자는 다른 명령어 보다도 맨위에 있어야함 ) -> 호출 animal();호->...-> object();까지가서 호출끝
// 명령어 다실행후 종료. 종룔 순서 object->animal super(); 끝 프린트 animal->cat super끝 print cat
