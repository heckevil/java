package ch05;

import java.util.Scanner;

public class VendingmachineMissoin3 {
	public static void main(String[] args) {
		/*
		 * 돈을 주입해 주세요 :3000 <메뉴> 1. 콜라(1,000원) 2.사이다(1,200원) 3.환타(1,300원)
		 * 
		 * 선태>1 콜라를 선택하셨습니다 (남은금액 2000원) 선택>2 환타를 선택하셨습니다 (남은금액 700원) 선택4> 잘못선택하셧습니다
		 * 선택>3 금액이 부족합ㄴ디ㅏ. (남은금액 700원) 선택>0 종료 - 남은금액ㅣ 700
		 */
		boolean run = true;
		String[] menuArr = { "콜라", "사이다", "환타" };
		int[] menuPrice = { 1200, 1000, 1500 };
		Scanner sc = new Scanner(System.in);
		System.out.println("돈을 주입해 주세요 > ");
		int insert = sc.nextInt();

		System.out.println("<메뉴>");
		for (int i = 0; i < menuArr.length; i++) {
			int choice = i + 1;
			System.out.printf("%d. %s(%,d원)\n", choice, menuArr[i], menuPrice[i]);
		}
		while (run) {
			if (insert != 0) {
				System.out.println("선택 > ");
				int choiceNum = sc.nextInt();
				int choiceID = choiceNum - 1;

				if (choiceNum < 0 || choiceNum > 4) {
					System.out.println("잘 못 입력하셨습니다.");
					continue;
				} else if (choiceNum == 1 || choiceNum == 2 || choiceNum == 3) {
					System.out.printf("%s를 선택 하셧습니다.\n", menuArr[choiceID]);
					insert = insert - menuPrice[choiceID];
					System.out.println("남은 금액 : " + insert);
					if (insert < 0) {
						System.out.printf("금액이 부족합니다. (부족한 금액 %d)\n", (-insert));
						break;
					} else if (insert == 0) {
						run = false;
						System.out.printf("종료");
					}
				} else if (choiceNum == 0) {
					System.out.println("종료 - 남은금액 : " + insert);
					run = false;
				}
			}
		}

	}
}
