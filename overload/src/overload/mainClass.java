package overload;

public class mainClass {
	public static void main(String[] args) {
		
	
	/* 			Over Load :함수(메소드)명은 같고
	  			  매개변수(인수,인자)의 자료형이나
	  			  인수의 갯수가 다른 것을 의미한다.
	  
	  			image drawing ->알파(투명),불투명
	  							RGBA     RGB
	  			imageDrawA(int x,int y,int a)
	  			
	  			imageDraw(int x,int y)
	 */
			int num1 = Integer.parseInt("123");
			
			
			System.out.println("num1 ="+num1);
		/*
			 	unsigned byte = 0~255
			 	signed byte   = -128~127
			 	
			 */
				funcName();
				
				funcName('A');
				
				funcName(123);
				
				funcName('A',123);

				funcName(123,'A');
}
	static void funcName() {
		System.out.println("funcname()호출");
		
		
	}
	static void funcName(char c) {
		System.out.println("funnamer()호출");
		
	}
	static void funcName(int i) {
		System.out.println("funcnAme()호");
		
	}
	static void funcName(char c,int i) {  //getter 
		System.out.println("문자 c 인트 i");
	}
	static void funcName(int i,char c) {  //getter 
	//static void funcName(int i,char b) { << 같은 함수의 다른 변수도 불가하다 자료형 타입에 따라 오버로딩이결정됨
		System.out.println("인트 i 문자 c");
	}
		//static int funcName(int i,char c) { 리턴값은 서로 구분짓지못함
		//system.out.println();
		//return;
	}
	
