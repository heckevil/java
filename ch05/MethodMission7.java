package ch05;

import java.util.Scanner;

public class MethodMission7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String answer = null;

		do {
			System.out.println("성별 : ");
			String gender = sc.next(); // 남,녀

			System.out.println("키 : ");
			int height = sc.nextInt();
			String result = chk(gender, height);
			System.out.println(result);// 성별ㅣ 남 , 키 170cm, 평균미만

			System.out.println("계속 하시겠습니까(y,n).");
			answer = sc.next();

		} while (answer.equals("y"));
		System.out.println("끝");
		sc.close();

	}

	public static String chk(String gender, int weight) {
//		final int AviMan = 175;
//		final int AviGirl = 163;
//		String Value = "";
//		if (gender.equals("남")) {
//			if (weight > AviMan) {
//				Value = "이상";
//			} else if (weight < AviMan) {
//				Value = "이하";
//			}
//		} else {
//			if (weight > AviGirl) {
//				Value = "이상";
//			} else if (weight < AviGirl) {
//				Value = "이하";
//			}
//		} return "성별 : "+gender+", 키 : "+weight +" 평균"+Value;
	
	int stand = 163;
	String result = "평균";
	
	switch(gender) {
	case "남" : 
		stand = 175;
		break;
	case "여" :
		stand = 163;
		break;
	default :
		return "성별을 잘못 입력하셨습니다.";
	}
	
	if(weight > stand) {
		result = "평균초과";		
	} else if (weight < stand) {
		result  = "평균미만";
	}
	return String.format("성별 %s, 키: %dcm, %s", gender,weight,result);
	
	//return "성별 : " + gender + " , 키 : " + weight+"cm," + result;
		
		
		
		
		
		
	}
}