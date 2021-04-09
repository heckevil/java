package ch06;

public class InstanceExam2 {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		dog d1 = new dog();
		dog d2 = d1; // °´Ã¼¸¦ ¿©·¯°³ ¸¸µå·Á¸é new°¡ ¿©·¯°³ ³ª¿Í¾ßÇÔ
		//d1, d2 ´Â ÇÏ³ªÀÇ °´Ã¼¸¦ °¡¸£Å´
		
		
		d1.name = "»Ç»ß";
		d2.name = "µ¹¼è";
		
		d1.bark();
		

	}
}