package ch06;

public class StaticExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toy2 t1 = new Toy2();
		Toy2 t2 = new Toy2();
		
		System.out.println("�峭�� ���� ���� : "+Toy2.makecount);
		
	}

}
class Toy2{
	static int makecount;//static�� ������ �� ���ۿ� ������ �ȴ� �����->�Ե� ���� ����
	//�׷��Ƿ� ��� �Ե��� ����
	//����ƽ Ŭ������ �ּҰ�.�Ӽ��� �ƴ϶� Ŭ����.�Ӽ����� ���� ���ִ°� ����
	Toy2(){
		makecount++;
	}
}