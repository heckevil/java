package ch05;

import java.util.Scanner;

import ch06.Drink;

public class VendingmachineMissoin {
	public static void main(String[] args) {
		/*
		 * <�޴�> 1. �ݶ�(1,000��) 2.���̴�(1,200��) 3.ȯŸ(1,300��)
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		Drink[] drinkArr = new Drink[3];
		String[] menuArr = { "�ݶ�", "���̴�", "ȯŸ" };
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
//			System.out.println("<�޴�>");
//			for (int i = 0; i < menuArr.length; i++) {
//				System.out.printf("%d. %s(%,d��)\n", i + 1, menuArr[i], menuPrice[i]);
//			}
//			System.out.println("���� > ");
//			int choice = sc.nextInt();
//
//		}

	public static void printMenu3(Drink[] drinkArr) {

		for (int i = 0; i < drinkArr.length; i++) {
			System.out.printf("%d. %s %d��\n", i + 1, drinkArr[i].nm, drinkArr[i].price);
		}

	}

}
