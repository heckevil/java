package ch06;

public class ConstructorExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Tv2 tv = new Tv2();
		tv.displayState();
		// �Ϸ�Ʈ�� 20inch 100channel 50volume

	}

}

class Tv2 {
	String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currenVolume;

	// �⺻ ������ () �� ����
	// ������ vs �żҵ� ���� ��
	// ������ �̸��� Ŭ���� �̸��̶� ����.
	// ���� Ÿ���� ����.
	// ��ü�� �����ҋ��� ��� �����ϴ� �׿ܿ� ��� �Ұ���
	// �⺻�����ڴ� �����Ϸ��� �����ڰ� �ϳ��� ���� �� �־��ش�.
	Tv2(String brand, int inch, int maxChannel, int maxVolume) {
		this.brand = brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxChannel; //this.�� ��� �żҵ� Ȥ�� �ɹ� �ʵ�
	} // �����ڰ� �ϳ� ����� �̿� ���缭 �ؾ��Ѵ�

	Tv2() {
		
		this("�Ϸ�Ʈ��", 50 ,100,50); //this()������ 100���� �����ڸ� ����´�

	} // �⺻�����ڰ� ������ �����Ϸ��� �������µ� �ϳ� ���̷� ��������� ���� �־�����Ѵ�.

	void volumeUp() {
		this.currenVolume++; // �ڱ��ڽ��� �ּҰ� this
	}

	void displayVolume() {
		System.out.printf("%s �������� : %d\n", brand, currenVolume);
	}

	void displayState() {
		System.out.printf(brand + " " + inch + "inch " + maxChannel + "Channel " + maxVolume + "volume \n");
	}
}
