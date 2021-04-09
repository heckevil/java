package ch06;

public class AccessExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		-private : private이 씌여져 있는 클래스 안에서만 접근할수 있다.
		-default(초기값) : 같은 패키지 안에있으면 호출 가능 
		
		
		
		
//		종류    private default protected public
//		class    O       O        O       O     
//		패키지    X       O        O        O
//		상속관계  X       X         O       O
//		전체     X       X         X       X 
		Accese acc = new Accese();
		acc.num = 10; //private이 씌여져 있는 지역변수는 전역변수에서 사용불가
		
		
	}

}


class Accese {
	
	private int num;
	
	void printNum() {
		System.out.println("num : "+num);//같은 클래스 안에서 접근가능
	}
	
} 
