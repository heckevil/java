package ch05;

public class MethodMission6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = getRandomScore(50, 100);
		
		// 랜덤숫자 50~100
		char grade = getGrade(score);
		// 90점이상 A
		// 80점이상 b
		// 70점이상 c
		// 60점이상 d
		// 나머지 e

		char garde2 = getGradesign(score);
		// 두번째 자리가 8~ 100점이면 +
		// 3이하이면 -
		// 나머지 빈칸
		System.out.printf("%d : %c%c\n", score, grade, garde2);
		 }

	public static int getRandomScore(int a, int b) {
		return (int) (Math.random() * (b - a) + a);
	}

	public static char getGrade(int score) {
		switch (score / 10) {
		case 10:
		case 9:
			return 'A';
		case 8:
			return 'B';
		case 7:
			return 'C';
		case 6:
			return 'D';
		}
		return 'E';
	}

	public static char getGradesign(int score) {
		int mod = score % 10; 
		if(score == 100 || mod>=8) {
			return '+';
		} else if (mod <= 3) {
			return '-';
	}
		return ' ';

}
}