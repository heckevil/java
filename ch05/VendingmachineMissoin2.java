package ch05;

import java.util.Scanner;

public class VendingmachineMissoin2 {
	public static void main(String[] args) {
		/*
		 * <메뉴> 1. 콜라(1,000원) 2.사이다(1,200원) 3.환타(1,300원)
		 * 
		 */

		String[] menuArr = { "콜라", "사이다", "환타" };
		int[] menuPrice = { 1000, 1200, 1300 };
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (true) {
			System.out.println("<메뉴>");
			for (int i = 0; i < menuArr.length; i++) {
				System.out.printf("%d. %s %,d\n", i + 1, menuArr[i], menuPrice[i]);
			}
			System.out.println("0. 정산");
//			System.out.println("선택 > ");
//			int i = sc.nextInt() - 1;
//			System.out.println(menuArr[i] + "를 선택하셨습니다.");
//			System.out.println();
//			break;
//			
			System.out.println("선택 > ");
			int choice = sc.nextInt();
			if (choice == 0) {
				if (sum != 0) {
					System.out.printf("종료 - 사용한 금액은 %,d : \n", sum);
				} else {
					System.out.println("메뉴를 한가지 이상 선택해주세요.");
				}

			} else if (choice >= 1 && choice <= menuArr.length) {
				System.out.printf("%s를 선택하셨습니다. \n", menuArr[choice - 1]);
				sum += menuPrice[choice - 1];

			} else {
				System.out.println("잘못 선택 하셨습니다.");
			}
		}

	}

}
