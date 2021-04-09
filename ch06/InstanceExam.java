package ch06;

public class InstanceExam {

	public static void main(String[] args) { //public은 파일명 클래스명 같은 애한테만 붙일수있다. 메인 클래스는 꼭 파일명이랑 일치해야한다
		// TODO Auto-generated method stub
		

		dog d1 = new dog (); // 만들고 계속 존재   new dog(); 만들자마자 소멸
		dog d2 = new dog();
//dog라는 타입 변수명  객체화를 시켜주는 키워드, 메소드
// new = 이 다음 메소드를 객체화한다. 메모리에 어딘가 위치화 시키고 그 주소값을 복사하여 옆으로 준다. 그럼 언제나 접근할수 있다.
		d1.bark(); //메모리에 올라가야 실화한다. new키워드로 메모리에 올림.
		d2.bark();
		d1.name = "뽀삐";
		d2.name = "돌쇠";
		
	}

}

//멤버필드(값을 저장할 수 있는 것) - 명사 담당,전역 변수
//멤버 메소드(값을 수정할 수 있는 것) - 동사 담당

class dog { //객체가 아니지만 객체화가 될수있다. 클래스가 붕어빵틀이라면 그 붕어빵 틀에서 나온 붕어빵이 객체이다.
	String name;
	int age;
	void bark() {  //퍼블릭 스택틱이 없는 메소드
		System.out.printf("%S가 멍멍\n",name);
	}
}