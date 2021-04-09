package ch06;

public class StaticExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toy2 t1 = new Toy2();
		Toy2 t2 = new Toy2();
		
		System.out.println("장난감 생산 갯수 : "+Toy2.makecount);
		
	}

}
class Toy2{
	static int makecount;//static이 붙으면 한 값밖에 저장이 안댐 디즈니->롯데 저장 변동
	//그러므로 계속 롯데가 나옴
	//스태틱 클래스는 주소값.속성이 아니라 클래스.속성으로 접근 해주는게 좋다
	Toy2(){
		makecount++;
	}
}