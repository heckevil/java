package ch06.blackjack;

public class Card {

	private String Parttern; // 3��
	private String Symbol; // 3��

	public Card(String Parttern, String Symbol) { // ����ʵ忡 �����Ҽ� �ִ� overloaded �����ڰ� �ִ�.
		this.Parttern = Parttern;
		this.Symbol = Symbol;

	}

	public String getParttern() { // ����ʵ� ī�������� getter�޼ҵ� ���� /3��
		return Parttern;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
	}

	public String getSymbol() { // ����ʵ� ī��ɺ��� getter�޼ҵ� ���� /3��
		return Symbol;
	}

	@Override
	public String toString() {
		String str = String.format(Parttern + "(" + Symbol + ")");
		return str;
	}

}
