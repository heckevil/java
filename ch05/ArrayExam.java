package ch05;

public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//배열( 같은 타입의 변수를 여러개 사용하기 편하기 위해 사용하는 것)
		
		int n1 ,n2, n3, n4, n5, n6;
		
		
		//변수 크게 분류 (원시형, 참조형)
		//원시형: byte short int float long double boolean char  
		//참조형 : 레버런스 타입
//		int[] intArr = new int[10]; // 10개의 각방에 디폴트 0값이 들어가있음.
//		intArr[0] = 11;
//		intArr[1]=12;
//		intArr[19] = 13;
//		intArr[3] = intArr[19] +4;
		
		String[] strArr = new String[10];
		//방타입[] 이름 = new 방타입[방갯수]
		System.out.println("strArr[1] : "+strArr[1]);  
		
		int len=300;
		int[] intArr = new int[len];
		
		int[] intArr2 = {10,20,30};
		//               0   1  2
		for(int i=0; i<3; i++) {
			System.out.printf("intArr[%d] : %d\n",i,intArr2[i]);
		}
		
	}

}
