package ch05;

import java.util.Scanner;

import ch06.Drink;

public class VendingmachineMissoin {
	public static void main(String[] args) {
		/*
		 * <메뉴> 1. 콜라(1,000원) 2.사이다(1,200원) 3.환타(1,300원)
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		Drink[] drinkArr = new Drink[3];
		String[] menuArr = { "콜라", "사이다", "환타" };
		int[] menuPrice = { 1000, 1200, 1300 };
		for (int i = 0; i < menuArr.length; i++) {
			Drink drink = new Drink();
			drink.nm = menuArr[i];
			drink.price = menuPrice[i];
			drinkArr[i] = drink;
			{
			}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
		}

		printMenu3(drinkArr);
	}

//		
//		while (true) {
//			System.out.println("<메뉴>");
//			for (int i = 0; i < menuArr.length; i++) {
//				System.out.printf("%d. %s(%,d원)\n", i + 1, menuArr[i], menuPrice[i]);
//			}
//			System.out.println("선택 > ");
//			int choice = sc.nextInt();
//
//		}

	public static void printMenu3(Drink[] drinkArr) {

		for (int i = 0; i < drinkArr.length; i++) {
			System.out.printf("%d. %s %d원\n", i + 1, drinkArr[i].nm, drinkArr[i].price);
		}

	}

}
