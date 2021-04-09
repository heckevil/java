package ch05;

public class MethodMission6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = getRandomScore(50, 100);
		
		// �������� 50~100
		char grade = getGrade(score);
		// 90���̻� A
		// 80���̻� b
		// 70���̻� c
		// 60���̻� d
		// ������ e

		char garde2 = getGradesign(score);
		// �ι�° �ڸ��� 8~ 100���̸� +
		// 3�����̸� -
		// ������ ��ĭ
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