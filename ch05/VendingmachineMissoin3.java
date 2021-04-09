package ch05;

import java.util.Scanner;

public class VendingmachineMissoin3 {
	public static void main(String[] args) {
		/*
		 * ���� ������ �ּ��� :3000 <�޴�> 1. �ݶ�(1,000��) 2.���̴�(1,200��) 3.ȯŸ(1,300��)
		 * 
		 * ����>1 �ݶ� �����ϼ̽��ϴ� (�����ݾ� 2000��) ����>2 ȯŸ�� �����ϼ̽��ϴ� (�����ݾ� 700��) ����4> �߸������ϼ˽��ϴ�
		 * ����>3 �ݾ��� �����դ���. (�����ݾ� 700��) ����>0 ���� - �����ݾפ� 700
		 */
		boolean run = true;
		String[] menuArr = { "�ݶ�", "���̴�", "ȯŸ" };
		int[] menuPrice = { 1200, 1000, 1500 };
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ �ּ��� > ");
		int insert = sc.nextInt();

		System.out.println("<�޴�>");
		for (int i = 0; i < menuArr.length; i++) {
			int choice = i + 1;
			System.out.printf("%d. %s(%,d��)\n", choice, menuArr[i], menuPrice[i]);
		}
		while (run) {
			if (insert != 0) {
				System.out.println("���� > ");
				int choiceNum = sc.nextInt();
				int choiceID = choiceNum - 1;

				if (choiceNum < 0 || choiceNum > 4) {
					System.out.println("�� �� �Է��ϼ̽��ϴ�.");
					continue;
				} else if (choiceNum == 1 || choiceNum == 2 || choiceNum == 3) {
					System.out.printf("%s�� ���� �ϼ˽��ϴ�.\n", menuArr[choiceID]);
					insert = insert - menuPrice[choiceID];
					System.out.println("���� �ݾ� : " + insert);
					if (insert < 0) {
						System.out.printf("�ݾ��� �����մϴ�. (������ �ݾ� %d)\n", (-insert));
						break;
					} else if (insert == 0) {
						run = false;
						System.out.printf("����");
					}
				} else if (choiceNum == 0) {
					System.out.println("���� - �����ݾ� : " + insert);
					run = false;
				}
			}
		}

	}
}
