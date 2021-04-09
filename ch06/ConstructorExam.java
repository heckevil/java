package ch06;

public class ConstructorExam {

	public static void main(String[] args) { 
		
		// TODO Auto-generated method stub
		
		//객체지향 언어는 모두 생성자를 사용한다.
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
	//기본 생성자 () 의 형태
	//생성자 vs 매소드 구분 법
	//생정자 이름은 클래스 이름이랑 같다. 
	//리턴 타입이 없다.
	//객체를 생성할떄만 사용 가능하다 그외엔 사용 불가능
	//기본생성자는 컴파일러가 생성자가 하나도 없을 시 넣어준다.
	Tv(String brand,int inch, int maxChannel,int maxVolume) { 
		this.brand =brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxChannel;
	} //생성자가 하나 생기면 이에 맞춰서 해야한다
	
	Tv(){} // 기본생성자가 없으면 컴파일러가 만들어줬는데 하나 임이로 만들었으니 새로 넣어줘야한다.
	
	void volumeUp() {
		this.currenVolume++; //자기자신의 주소값 this
	}
	void displayVolume() {
		System.out.printf("%s 현제볼륨 : %d\n",brand,currenVolume);
	}
	void displayState() {
		System.out.printf(brand + " "+inch+"inch "+maxChannel+"Channel "+maxVolume+"volume \n");
	}
}

