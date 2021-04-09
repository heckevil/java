package ch06;

public class InstanceExam5 {
	public static void main(String[] args) {

		Car[] carArr = new Car[5]; //카 배열 객체를 만듬
		
		Car car1 = new Car(); //카배열을 만듬
//		
//		System.out.println(carArr[0]); //배열의 디폴트값은 전부 null
//		System.out.println(carArr); //하지만 카배열 자체에는 주소값을 가지고있음
		
//  	carArr[0].name="그랜저"; = 에러 터짐 carArr[0]는 널값이 기본값이므로(주소X) 객체가 아니므로 객체화 할 수 없다
		carArr[0] = new Car(); //객체화 시킨후 
		carArr[0].name = "그렌저"; // 객체  속성 접근
		System.out.println();   //소문자 리터널값, 대문자 주소값
		
	}

}

