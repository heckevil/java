package ch06.blackjack;

import java.util.Arrays;

public class Carddeck {

	// 52개의 card 객체를 담을 수 있는 은닉화된 전역 배열 상수 존재.

	private final Card[] CARD_ARR = new Card[52]; // static = 배열이 한개만 저장된
	// finial 배열. 배열만 52개 고정 안에 내용은 바꿀수있음.

	// 생성자 기본 정의( 이름이 클래스랑 똑같다, 리턴타입을 적지않는다)

//	카드패턴 (parttern) : spedes, heart, diamonds, clubs
// 카드 심볼 (Symbol) : A ,2 ,3 ,4, 5, 6, ,7 ,8 ,9 ,10 ,J ,Q ,K
// 3점) 모두 다른 값을 가지고 있는 52개의 Card객체 생성
// 3점) 모든 배열을 객체에 담는다.

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
