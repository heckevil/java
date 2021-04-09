package ch05;

public class MethodMission3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int rNum = getRandomNum(); // 0~9
//		System.out.println("rNum : " + rNum);
//		rNum = getRandomNum();

		// int rNum = getRandomNum(aaaa); // 0~19
//		int rNum = getRandomNum(aaaa); // 0~4
//		System.out.println(rNum);
//	
		int rNum = getRandomNum(10,20);// 10~20
		System.out.println(rNum);
	}

	public static int getRandomNum(int num1, int num2) { // 이름은 상관없고 타입이 주요하다
		int i = 0,z = 0;
		if(num1 > num2) {
			i = num1;
			z = num2;
		} else {
			i = num2;
			z = num1;
			}
		
		return (int) (Math.random() * (i - z +1)+z);
	}
}
