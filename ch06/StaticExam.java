package ch06;

public class StaticExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toy t1 = new Toy();
		Toy t2 = new Toy();
		
		t1.name = "디즈니";
		System.out.println("t1.name : "+t1.name);
		
		Toy.name = "롯데";//클래스명. 으로 접근해야 한다.
		System.out.println("t2.name : "+t2.name);
		System.out.println("t1.name : "+t1.name);
		System.out.println("Toy.name : "+Toy.name);
		
		
	}

}
class Toy{
	static String name;//static이 붙으면 한 값밖에 저장이 안댐 디즈니->롯데 저장 변동
	//그러므로 계속 롯데가 나옴 
}