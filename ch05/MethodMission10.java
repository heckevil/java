package ch05;

import java.util.Scanner;

public class MethodMission10 {

	private static final String Scanner = null;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] menuArr = { "�ݶ�", "���̴�", "ȯŸ" };
		int[] menuPrice = { 1000, 1200, 1300 };

		printMenu(menuArr, menuPrice);
		while (chooseMenu(sc, menuArr.length)) {

		}

	}

//	public static void printMenu(String[] menuArr, int[] menuPrice) {
//		for(int i=0; i<=menuArr.length-1;i++) {
//			System.out.printf("%d. %s (%d)\n",i+1,menuArr[i],menuPrice[i]);
//		}

	public static boolean chooseMenu(Scanner sc, int len) {
		System.out.println("���� > ");
		int selectedNum = sc.nextInt();
		return true;
	}

	public static void printMenu(String[] menuArr, int[] menuPrice) {
		String str = "<�޴�>\n";
		for (int i = 0; i <= menuArr.length - 1; i++) {
			str += String.format("%d. %s (%,d��)\n", i + 1, menuArr[i], menuPrice[i]);
		}
		System.out.println(str);
	}
}
