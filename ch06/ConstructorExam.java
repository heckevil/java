package ch06;

public class ConstructorExam {

	public static void main(String[] args) { 
		
		// TODO Auto-generated method stub
		
		//��ü���� ���� ��� �����ڸ� ����Ѵ�.
		//
		Tv tv = new Tv();
		
		tv.brand = "Samsung";
		tv.inch = 100;
		tv.maxChannel = 200;
		tv.maxVolume = 100;
		tv.displayState();
		//Samsung 100inch 100Channel 100Volume
		Tv tv2 = new Tv("Lg",200,150,200);
		//LG 200inch 150Channel 200Volume
		tv2.displayState();
	}
	
	
}

class Tv{
	String brand;
	int inch;
	int maxChannel;
	int	maxVolume;
	int currentChannel;
	int currenVolume;
	//�⺻ ������ () �� ����
	//������ vs �żҵ� ���� ��
	//������ �̸��� Ŭ���� �̸��̶� ����. 
	//���� Ÿ���� ����.
	//��ü�� �����ҋ��� ��� �����ϴ� �׿ܿ� ��� �Ұ���
	//�⺻�����ڴ� �����Ϸ��� �����ڰ� �ϳ��� ���� �� �־��ش�.
	Tv(String brand,int inch, int maxChannel,int maxVolume) { 
		this.brand =brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxChannel;
	} //�����ڰ� �ϳ� ����� �̿� ���缭 �ؾ��Ѵ�
	
	Tv(){} // �⺻�����ڰ� ������ �����Ϸ��� �������µ� �ϳ� ���̷� ��������� ���� �־�����Ѵ�.
	
	void volumeUp() {
		this.currenVolume++; //�ڱ��ڽ��� �ּҰ� this
	}
	void displayVolume() {
		System.out.printf("%s �������� : %d\n",brand,currenVolume);
	}
	void displayState() {
		System.out.printf(brand + " "+inch+"inch "+maxChannel+"Channel "+maxVolume+"volume \n");
	}
}

