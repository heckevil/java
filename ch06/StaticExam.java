package ch06;

public class StaticExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toy t1 = new Toy();
		Toy t2 = new Toy();
		
		t1.name = "�����";
		System.out.println("t1.name : "+t1.name);
		
		Toy.name = "�Ե�";//Ŭ������. ���� �����ؾ� �Ѵ�.
		System.out.println("t2.name : "+t2.name);
		System.out.println("t1.name : "+t1.name);
		System.out.println("Toy.name : "+Toy.name);
		
		
	}

}
class Toy{
	static String name;//static�� ������ �� ���ۿ� ������ �ȴ� �����->�Ե� ���� ����
	//�׷��Ƿ� ��� �Ե��� ���� 
}