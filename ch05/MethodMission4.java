package ch05;

public class MethodMission4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumAllfromTo(10, 5); // 5~10´õÇÏ±â

	}

	public static void SumAllfromTo(int n1, int n2) {
		int sum = 0;
		if (n1 > n2) {
			int temp = n2;
			n2 = n1;
			n1 = temp;
		}
		       for (int i = n1; i <= n2; i++) {

			sum = sum + i;
		}
		System.out.println(sum);

	}

}
