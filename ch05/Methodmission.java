package ch05;

public class Methodmission {
	public static void main(String[] args) {
//		whoIsBig(10, 30); //콘솔 30이 가장 큼니다.
//		
//		whoIsBig(10, 9); //콘솔 10이 가장 큼니다.
//		
//		whoIsBig(11, 25); //콘솔 25이 가장 큼니다.
		whoIsBig(11, 12);

		int big = getBigNum(10, 30);
		System.out.println("big : " + big); // big:30

		big = getBigNum(10, 9);
		System.out.println("big : " + big); // big:10
	}

	public static void whoIsBig(int n1, int n2) {
//		if(n1 > n2) {
//			System.out.printf("%d이 가장 큽니다",n1);
//		} else {System.out.printf("%d이 가장 큽니다",n2);}
		int big = n1;
		if (n1 < n2) {
			big = n2;
		}
		System.out.printf("%d가 더 틉니다\n", big);
	}
	public static int getBigNum(int n1, int n2) {
	
		if(n1 < n2) {
			return n2;
		}
		return n1;
	}
}
