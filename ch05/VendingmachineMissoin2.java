package ch05;

import java.util.Scanner;

public class VendingmachineMissoin2 {
	public static void main(String[] args) {
		/*
		 * <�޴�> 1. �ݶ�(1,000��) 2.���̴�(1,200��) 3.ȯŸ(1,300��)
		 * 
		 */

		String[] menuArr = { "�ݶ�", "���̴�", "ȯŸ" };
		int[] menuPrice = { 1000, 1200, 1300 };
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (true) {
			System.out.println("<�޴�>");
			for (int i = 0; i < menuArr.length; i++) {
				System.out.printf("%d. %s %,d\n", i + 1, menuArr[i], menuPrice[i]);
			}
			System.out.println("0. ����");
//			System.out.println("���� > ");
//			int i = sc.nextInt() - 1;
//			System.out.println(menuArr[i] + "�� �����ϼ̽��ϴ�.");
//			System.out.println();
//			break;
//			
			System.out.println("���� > ");
			int choice = sc.nextInt();
			if (choice == 0) {
				if (sum != 0) {
					System.out.printf("���� - ����� �ݾ��� %,d : \n", sum);
				} else {
					System.out.println("�޴��� �Ѱ��� �̻� �������ּ���.");
				}

			} else if (choice >= 1 && choice <= menuArr.length) {
				System.out.printf("%s�� �����ϼ̽��ϴ�. \n", menuArr[choice - 1]);
				sum += menuPrice[choice - 1];

			} else {
				System.out.println("�߸� ���� �ϼ̽��ϴ�.");
			}
		}

	}

}
