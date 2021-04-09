package ch06.blackjack;

import java.util.Arrays;

public class Carddeck {

	// 52���� card ��ü�� ���� �� �ִ� ����ȭ�� ���� �迭 ��� ����.

	private final Card[] CARD_ARR = new Card[52]; // static = �迭�� �Ѱ��� �����
	// finial �迭. �迭�� 52�� ���� �ȿ� ������ �ٲܼ�����.

	// ������ �⺻ ����( �̸��� Ŭ������ �Ȱ���, ����Ÿ���� �����ʴ´�)

//	ī������ (parttern) : spedes, heart, diamonds, clubs
// ī�� �ɺ� (Symbol) : A ,2 ,3 ,4, 5, 6, ,7 ,8 ,9 ,10 ,J ,Q ,K
// 3��) ��� �ٸ� ���� ������ �ִ� 52���� Card��ü ����
// 3��) ��� �迭�� ��ü�� ��´�.

	public Carddeck() {

		String[] card_name = { "Spades", "Heart", "Diamonds", "Clubs" };
		String[] card_num = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		int count = 0;
		for (int i = 0; i < card_name.length; i++) {
			for (int z = 0; z < card_num.length; z++) {
				Card basket = new Card(card_name[i], card_num[z]);
				CARD_ARR[count] = basket;
				count++;

			}
		}

	}
	Card tostr (int a) {
		return CARD_ARR[a];
	}
}
