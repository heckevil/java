package ch06.blackjack;

public class Card {

	private String Parttern; // 3점
	private String Symbol; // 3점

	public Card(String Parttern, String Symbol) { // 멤버필드에 주입할수 있는 overloaded 생성자가 있다.
		this.Parttern = Parttern;
		this.Symbol = Symbol;

	}

	public String getParttern() { // 멤버필드 카드패턴의 getter메소드 존재 /3점
		return Parttern;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
	}

	public String getSymbol() { // 멤버필드 카드심볼의 getter메소드 존재 /3점
		return Symbol;
	}

	@Override
	public String toString() {
		String str = String.format(Parttern + "(" + Symbol + ")");
		return str;
	}

}
