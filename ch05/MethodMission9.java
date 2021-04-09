package ch05;

public class MethodMission9 {

	public static void main(String[] args) {
		gugudan(2);
		// 8 * 1 = 8
		// 8 * 2 = 16
		// ...
		// 8 * 9 = 72
		gugudan2(4, 8);

	}

	public static void gugudan(int value) {
		for (int i = 1; i <= 9; i++) {
			int mul = value * i;
			System.out.printf("%d * %d = %d\n", value, i, mul);
		}
	}

	public static void gugudan2(int num1, int num2) {
		for (int i = num1; i <= num2; i++) {
			gugudan(i);
			System.out.println("-----------------");
		}
	}
}
