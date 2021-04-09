package ch05;

public class MeThodExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = sum (10 , 20); //여기서 메소드를 불러온다
		//				 안에서 정의를 하면 안되고 값을 보내야함
		// (int =a, int =b) XXX
		System.out.println("result : " + result);
		
		int result2 = minus( 50, 30 );
		System.out.println("result2 : " + result2);

	}
	public static int sum(int n1, int n2) { //메소드 안에 메소드 하면 안대!
		//        리턴할 값의 타입을 꼭 정의    메소드를 정의한다
		return n1 + n2;
		// n1+n2 값을 데리고 호출한 곳으로 돌아간다.
	}
	public static int minus(int n1, int n2) {
		return n1 - n2;
	}
	
}
