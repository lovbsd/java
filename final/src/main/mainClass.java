package main;

public class mainClass {

	public static void main(String[] args) {
		
		// final : 제약
		/*
			변수, 메소드, 클래스
		*/
		final int number = 10;	// 변수 -> 상수(대입용) 
		final int MAX = 100;
		int num;		
		num = number;
		num = MAX;
		// number = 2; 
	}
}

final class superClass{	// 상속 금지
	int number;
	
	public superClass() {
	}
	public final void method() { // over ride 금지			
	}	
}

/*
class thisClass extends superClass{
//	public void method() {	// over ride		
//	}
}
*/





