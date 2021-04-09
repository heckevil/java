package ch05;

public class MethodMission8 {
	public static void main(String[] args) {

		int[] arr = { 4, 8, 10, 11, 45, 55 };

		// System.out.println(Arrays.toString(arr));
		String result = toString(arr);
		System.out.println(result);

	}

	public static String toString(int[] arr) {
		String str = "";
		int num = arr.length-1;
		int last = arr[num];
			for (int z = 0; z < arr.length - 1; z++) {
				str = str + arr[z] + ",";
			}
		return String.format("[%s]", str+last);

	}
}
