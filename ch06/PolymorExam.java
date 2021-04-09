package ch06;

public class PolymorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//메소드 기준 다양성
		// 1. 부모 타입의 변수는 자식객체 가리킬 수 있다.
		// 2. 부모타입의 변수는 부모 객체 가리킬 수 없다.
		// # 자신의 타입 객체는 자신의 타입 객체를 가리킬수 있다.
		// 3. 타입은 아는 메소드만 호출할수 있다.
		//  호출이 되었다면 기준은 객체이다.
		
		Animal ani_1 = new Cat(); //1.
		System.out.println("1.번");
		
		//Cat cat1 = new Animal(); //2. 실행조차 안댐
		
		
		//Cat cat = ani_1;// 3. 혹시나 2번일까바 컴파일러가 애러 터트림
		Cat cat = (Cat)ani_1;//cat으로 강제 형변환
		
		ani_1.howling();//냐옹 나온이유, 호풀이 잘되었다면 기준은 객체기준 Cat이 된다.
		cat.howling(); //같은객체에서 나왔기떄문 같으걸 실행
		ani_1.lick();//animal 자식의 추가된 메소드를 모른다.
		
	}

}
