package ch05;

import java.util.Scanner;

public class MethodMission7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String answer = null;

		do {
			System.out.println("���� : ");
			String gender = sc.next(); // ��,��

			System.out.println("Ű : ");
			int height = sc.nextInt();
			String result = chk(gender, height);
			System.out.println(result);// ������ �� , Ű 170cm, ��չ̸�

			System.out.println("��� �Ͻðڽ��ϱ�(y,n).");
			answer = sc.next();

		} while (answer.equals("y"));
		System.out.println("��");
		sc.close();

	}

	public static String chk(String gender, int weight) {
//		final int AviMan = 175;
//		final int AviGirl = 163;
//		String Value = "";
//		if (gender.equals("��")) {
//			if (weight > AviMan) {
//				Value = "�̻�";
//			} else if (weight < AviMan) {
//				Value = "����";
//			}
//		} else {
//			if (weight > AviGirl) {
//				Value = "�̻�";
//			} else if (weight < AviGirl) {
//				Value = "����";
//			}
//		} return "���� : "+gender+", Ű : "+weight +" ���"+Value;
	
	int stand = 163;
	String result = "���";
	
	switch(gender) {
	case "��" : 
		stand = 175;
		break;
	case "��" :
		stand = 163;
		break;
	default :
		return "������ �߸� �Է��ϼ̽��ϴ�.";
	}
	
	if(weight > stand) {
		result = "����ʰ�";		
	} else if (weight < stand) {
		result  = "��չ̸�";
	}
	return String.format("���� %s, Ű: %dcm, %s", gender,weight,result);
	
	//return "���� : " + gender + " , Ű : " + weight+"cm," + result;
		
		
		
		
		
		
	}
}