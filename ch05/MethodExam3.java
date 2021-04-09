package ch05;

public class MethodExam3 {
	public static void main (String[] args) {
	int mon = 10;
	printSeason(mon);
		}
	
	public static void printSeason(int mon) {
		switch(mon){
		case 3: case 4: case 5:
			System.out.println("봄");
			return; // void형은 return을 만나면 메소드가 종료된다. break랑 같은 역할
		case 6: case 7: case 8:
			System.out.println("여름");
			return;
		case 9: case 10: case 11:
			System.out.println("가을");
			return;
		case 1: case 12: case 2:
			System.out.println("겨울");
			return;
			}
		System.out.println("잘 못 입력 하셨습니다");
	}
	}
