package ch05;

public class MethodExam2 {
	public static void main (String[] args) {
		int n1= 10, n2=30;
		voidsum(n1,n2);//매소드만 불러와서 값을 입력후 디버깅해도 출력이됨
		
		voidsum (1,2);//보이드형 어딘가 소속되어 있으면 안댐
		System.out.println("----------");
		int result = intsum(n1,n2); // 비보이드형은 어딘가 소속가능 단 출력 타입이 메소드랑 같아야함
		System.out.println("result-1 : "+result);
		result = intsum(1,2);
		System.out.println("result-2 : "+result);
		
		for(int i=0; i<100; i++) {
			hello();
		}
	}
	public static void voidsum(int n1, int n2) {
		System.out.printf("%d + %d = %d \n",n1,n2,(n1+n2));//매소드에 프린트를 정의
		//리턴타입 : void, 비void
		//파라미터 : O.X
		
	}
	public static void hello () {
		System.out.println("안녕하세요!"); //파라미터도 없음, 보이드형
	}
	
	public static int intsum(int n1, int n2) {
		return n1 + n2;
		}
	}
