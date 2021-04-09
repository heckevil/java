package ch05;

public class MethodMission2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10, n2 = 3;
		double result = divide(n1, n2);
		System.out.println("result : " + result); // 3.33333
		n2 = 5;
		result = divide(n1, n2);
		System.out.println("result : " + result); // 2.0
	
		System.out.println("절대값 : " + abs(7)); // 10
		
		System.out.println("절대값 : " + abs(-5)); // 10
	}

	public static double divide(int n1, int n2) {
		return (double)n1 / n2;

	}
	public static int abs(int num) {
		if(num>0) {
			return num;
		} else {
			return -num;
		}
		
		
	}
	}
