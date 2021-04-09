package ch06.blackjack;

import java.util.Arrays;

public class CardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1 = new Card("Spade", "A"); // 3Á¡

		System.out.println(c1); // Spaed(K)

		Card c2 = new Card("heart", "2");
		System.out.println(c2); // Heat(2)
		
		Carddeck d = new Carddeck();
		for(int i=0; i<=53; i++) {
			System.out.println(d.tostr(i));
		}
	}
//public static void println(String str) {
//	System.out.println(str);
//}
//
//public static void println(Object obj) {
//	System.out.println("obj2");
//	println(obj.toString());
//}
}
