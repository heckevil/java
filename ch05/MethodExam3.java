package ch05;

public class MethodExam3 {
	public static void main (String[] args) {
	int mon = 10;
	printSeason(mon);
		}
	
	public static void printSeason(int mon) {
		switch(mon){
		case 3: case 4: case 5:
			System.out.println("��");
			return; // void���� return�� ������ �޼ҵ尡 ����ȴ�. break�� ���� ����
		case 6: case 7: case 8:
			System.out.println("����");
			return;
		case 9: case 10: case 11:
			System.out.println("����");
			return;
		case 1: case 12: case 2:
			System.out.println("�ܿ�");
			return;
			}
		System.out.println("�� �� �Է� �ϼ̽��ϴ�");
	}
	}
