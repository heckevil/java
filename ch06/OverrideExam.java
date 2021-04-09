package ch06;

public class OverrideExam {

	public static void main(String[] args) {

		Numbox nb1 = new Numbox(10);
		Numbox nb2 = new Numbox(10);

		System.out.println(nb1);
		System.out.println(nb2);// �ּҰ��� �ٸ�
		System.out.println("nb1 == nb2 : " + (nb1 == nb2));// �ּҰ� ��
		System.out.println("nb1.equals(nb2) : " + nb1.equals(nb2));// why false
	}

}

class Numbox {
	private int num;

	Numbox(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	@Override
	public boolean equals(Object obj) {
		NumBox temp = (NumBox)obj;
		return this.getNum() == temp.getNum();
	}
}